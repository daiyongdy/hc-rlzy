package com.cd.hc.interceptor;

import com.cd.hc.controller.console.model.AdminDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zuti on 2018/3/23.
 * email zuti@centaur.cn
 */
public class ConsoleLoginInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		Object obj = httpServletRequest.getSession().getAttribute("admin");
		if (obj == null) {
			httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
			httpServletResponse.sendRedirect("/console/toLogin");
			return false;
		} else {
			AdminDto adminDto = (AdminDto) obj;
			httpServletRequest.getSession().setAttribute("admin", adminDto);
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

	}
}
