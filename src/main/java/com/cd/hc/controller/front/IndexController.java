package com.cd.hc.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by zuti on 2018/3/22.
 * email zuti@centaur.cn
 */

@Controller
@RequestMapping("")
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "index/index";
	}
}
