
package com.hcl.service;



import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.hcl.repo.EmployeeRepository;
import com.hcl.model.Employee;



@Service
@Transactional
public class EmployeeServiceImpl implements  EmployeeService{
	@Autowired
	EmployeeRepository repo;


	public List<Employee> fetchEmployee() {
		List<Employee> ls = repo.findAll();
		return ls;
	}



	public List<Employee> fetchByName(String name) {
		List<Employee> ls = repo.findByName(name);
		return ls;
	}



	public void saveEmployee(Employee employee) {
		repo.save(employee);
		
	}
}


