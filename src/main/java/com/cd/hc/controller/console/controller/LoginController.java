package com.cd.hc.controller.console.controller;

import com.cd.hc.controller.console.model.AdminDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zuti on 2018/3/22.
 * email zuti@centaur.cn
 */
@Controller
@RequestMapping("/console")
public class LoginController {

	/**
	 * 管理员登录名和密码
	 */
	@Value("${consoleLoginUsername}")
	private String consoleLoginUsername;
	@Value("${consoleLoginPassword}")
	private String consoleLoginPassword;

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
	public Map<String, Object> login(String username, String password, HttpServletRequest request) {
		Map<String, Object> result = new HashMap<>();

		//登录成功
		if (username.trim().equals(consoleLoginUsername) && password.trim().equals(consoleLoginPassword)) {
			result.put("code", "200");
			result.put("success", true);
			result.put("msg", "登录成功");
			request.getSession().setAttribute("admin", new AdminDto(username, password));
		}
		//登录失败
		else {
			result.put("code", "500");
			result.put("success", false);
			result.put("msg", "登录失败");
		}

		return result;
	}

	@RequestMapping("/logout")
	@ResponseBody
	public Map<String, Object> logout(HttpServletRequest request) {
		Map<String, Object> result = new HashMap<>();
		request.getSession().removeAttribute("admin");
		result.put("code", "200");
		result.put("success", true);
		result.put("msg", "登录成功");
		return result;
	}

}
