package com.hcl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	List<Employee> findByName(@Param("name") String name);
}
