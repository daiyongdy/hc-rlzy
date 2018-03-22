package com.cd.hc.controller.console;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zuti on 2018/3/22.
 * email zuti@centaur.cn
 */
@Controller
@RequestMapping("")
public class LoginController {




	/**
	 * 跳转登录页
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login/loginin";
	}

	@RequestMapping("login")
	@ResponseBody
	public Map<String, Object> login(String username, String password) {
		Map<String, Object> result = new HashMap<>();
		result.put("success", true);
		return result;
	}

}
