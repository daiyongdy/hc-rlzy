package com.cd.hc.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zuti on 2018/3/23.
 * email zuti@centaur.cn
 */
@Configuration
public class ContainerConfig {

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return container -> {
			//session过期时间为 1小时
			container.setSessionTimeout(3600);
		};
	}

}
