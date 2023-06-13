package com.ezauto.ezauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class EzAutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzAutoApplication.class, args);

		System.out.println("Hello World!");
	}

}
