package com.ssafy.happyhouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssafy.happyhouse.repository.mapper")
public class HappyHouseAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyHouseAdminApplication.class, args);
	}
}
