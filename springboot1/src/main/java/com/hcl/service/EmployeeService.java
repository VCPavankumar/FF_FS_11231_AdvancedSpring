package com.hcl.service;

import java.util.List;

import com.hcl.model.Employee;

public interface EmployeeService {

	void saveEmployee (Employee employee);
	List<Employee> fetchEmployee();
	List<Employee> fetchByName(String name);
}







