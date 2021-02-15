package com.hcl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class PersonServiceImpl implements PersonService {
@Autowired
PersonDao persondao;
	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		persondao.savePerson(person);
	}

	@Override
	public List<Person> fetchPerson() {
		// TODO Auto-generated method stub
		List<Person> list=persondao.fetchPerson();
		return list;
	}

}
