package com.hcl.training.service;

//import java.util.List;

import com.hcl.training.entity.Person;

public interface PersonService {
    void add(Person person);
    Iterable<Person> listPersons();
}
