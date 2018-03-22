package com.cd.hc.controller.console;

import com.cd.hc.dao.model.po.HCUserDO;
import com.cd.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zuti on 2018/3/22.
 * email zuti@centaur.cn
 */
@Controller
@RequestMapping("/user")
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

}
