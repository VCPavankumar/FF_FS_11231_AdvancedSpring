package com.hcl.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Person;
import com.vc.service.PersonService;


@RestController
public class PersonController {
	@Autowired
	PersonService personservice;

	@GetMapping("/welcome")
	public String empform() {
		return "Hello welcome to HCL";
	}
}
