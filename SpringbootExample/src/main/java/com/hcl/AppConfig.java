package com.hcl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppConfig {
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name",defaultValue = "world")String name) {
		return String.format("Hello %s!", name);
	}

}
