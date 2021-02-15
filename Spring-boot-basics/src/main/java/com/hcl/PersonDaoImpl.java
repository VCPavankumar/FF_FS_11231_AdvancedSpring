package com.hcl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PersonDaoImpl implements PersonDao {
	@Autowired
	SessionFactory factory;

	
	public void savePerson(Person person) {
		factory.getSessionFactory().openSession().save(person);
		
	}

	
	public List<Person> fetchPerson() {
		// TODO Auto-generated method stub
		List<Person> list=factory.getSessionFactory().getCurrentSession().createQuery("from Person").list();
		return list;
	}

}
