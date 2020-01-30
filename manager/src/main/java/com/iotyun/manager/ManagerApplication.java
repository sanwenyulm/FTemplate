package com.iotyun.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

import com.iotyun.manager.netty.DtuServer;

@SpringBootApplication
@MapperScan("com.iotyun.manager.mapper")
@EnableCaching
public class ManagerApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(ManagerApplication.class, args);
		
		SpringUtil.setApplicationContext(app);
		try {
			DtuServer.beginReciveDtuData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
