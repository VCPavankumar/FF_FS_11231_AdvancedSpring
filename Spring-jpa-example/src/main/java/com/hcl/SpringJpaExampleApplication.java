package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class SpringJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaExampleApplication.class, args);
	}

}
