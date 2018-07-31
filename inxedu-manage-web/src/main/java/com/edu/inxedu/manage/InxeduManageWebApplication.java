package com.edu.inxedu.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan("com.edu.inxedu")
@MapperScan("com.edu.inxedu.manage.mapper")
public class InxeduManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(InxeduManageWebApplication.class, args);
	}
}
