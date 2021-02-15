package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping(value = "/welcome")
	public String empform() {
		return "Hello welcome to hcl";
	}

	@PostMapping(value = "/saveEmployee")
	public String saveEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
		return "saved successfully";

	}

	@GetMapping(value = "/fetchEmployees")
	public List<Employee> fetchEmployees() {
		List<Employee> ls = service.fetchEmployee();
		return ls;

	}
}
