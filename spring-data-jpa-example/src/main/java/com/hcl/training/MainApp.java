package com.hcl.training;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.training.config.AppConfig;
import com.hcl.training.entity.Person;
import com.hcl.training.service.PersonService;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      PersonService personService = context.getBean(PersonService.class);

      // Add Persons
      personService.add(new Person("Rahul", "Gupta", "rahulgupta@company.com"));
      personService.add(new Person("Akshay", "Sharma", "akshaysharma@company.com"));
      personService.add(new Person("Ankit", "Sarraf", "ankitsarraf@company.com"));

      // Get Persons
      Iterable<Person> persons = personService.listPersons();
      for (Person person : persons) {
         System.out.println("Id = "+person.getId());
         System.out.println("First Name = "+person.getFirstName());
         System.out.println("Last Name = "+person.getLastName());
         System.out.println("Email = "+person.getEmail());
         System.out.println();
      }

      context.close();
   }
}
