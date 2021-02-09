package com.hcl.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.hcl.training.entity.Person;

public interface PersonDao extends CrudRepository<Person, Long>{
	  
   
  }

