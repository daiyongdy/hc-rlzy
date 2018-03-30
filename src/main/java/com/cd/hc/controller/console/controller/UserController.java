package com.cd.hc.controller.console.controller;

import com.cd.hc.dao.model.db.HCUserDO;
import com.cd.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zuti on 2018/3/22.
 * email zuti@centaur.cn
 */
@Controller
@RequestMapping("/console/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/add")
	public String add() {
		HCUserDO hcUserDO = new HCUserDO();
		hcUserDO.setUsername("daiyiong");
		userService.add(hcUserDO);
		return "success";
	}

	@RequestMapping("/count")
	@ResponseBody
	public int count() {
		return userService.getCount();
	}

}
