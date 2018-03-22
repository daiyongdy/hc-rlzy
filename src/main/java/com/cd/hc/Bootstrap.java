package com.cd.hc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.cd.hc.dao.mapper.db","com.cd.hc.dao.mapper.biz"})
public class Bootstrap {

	public static void main(String[] args) {


		SpringApplication.run(Bootstrap.class, args);
	}

}
