package com.hcl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
	
	@RequestMapping(value = "/welcome")
    public ModelAndView WelcomeDemo() {
        return new ModelAndView("Welcome");
    }

}
