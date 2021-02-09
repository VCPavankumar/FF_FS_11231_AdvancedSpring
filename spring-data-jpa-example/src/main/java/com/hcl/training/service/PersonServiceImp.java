package com.hcl.training.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.training.dao.PersonDao;
import com.hcl.training.entity.Person;

@Service
public class PersonServiceImp implements PersonService {

   @Autowired
   private PersonDao userDao;

   @Transactional
   public void add(Person person) {
      userDao.save(person);
   }

   @Transactional(readOnly = true)
   public Iterable<Person> listPersons() {
      return userDao.findAll();
   }

}
