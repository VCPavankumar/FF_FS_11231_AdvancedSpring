package com.hcl;

import java.util.List;

public interface PersonDao {
void savePerson (Person person);
List<Person> fetchPerson();
}
