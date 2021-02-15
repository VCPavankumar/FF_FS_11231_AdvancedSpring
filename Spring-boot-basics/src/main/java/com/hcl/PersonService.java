package com.hcl;

import java.util.List;

public interface PersonService {
	void savePerson (Person person);
	List<Person> fetchPerson();
}
