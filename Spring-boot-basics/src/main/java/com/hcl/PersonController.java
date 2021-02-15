package com.hcl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PersonController {
	@Autowired
	PersonService personservice;

	@RequestMapping("empform")
	public ModelAndView EmpformPage() {
		return new ModelAndView("empform");
	}

	@RequestMapping("save")
	public ModelAndView savePerson(@ModelAttribute("person") Person person) {
		personservice.savePerson(person);
		return new ModelAndView("success");

	}

	@RequestMapping("fetchPerson")
	public ModelAndView fetchPerson(@ModelAttribute("person") Person person) {
		List<Person> list = personservice.fetchPerson();
		return new ModelAndView("success", "listOfPersons", list);

	}
}
