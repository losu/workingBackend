package com.gft.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gft.crud.model.Person;
import com.gft.crud.service.PeopleService;

@RestController
public class PeopleController {

	@Autowired
	PeopleService peopleService;

	//@CrossOrigin(origins="http://localhost:8000")
	@RequestMapping(value="/people", method=RequestMethod.GET)
	@ResponseBody
	public List<Person> displayPeople() {
		return peopleService.findAll();
	}
	
	@RequestMapping(value="/people", method=RequestMethod.POST)
	public void addPerson(@RequestBody Person person){
		peopleService.addPerson(person);
		System.out.println("jesttem w post method");
	}
}
