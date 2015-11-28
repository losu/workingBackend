package com.gft.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.crud.model.Person;
import com.gft.crud.repository.Repo;

@Service
public class PeopleService {

	
//	@Autowired
//	PeopleRepo peopleDAO;
	
	
	@Autowired 
	Repo peopleRepo;
	

	public List<Person> findAll(){
		return peopleRepo.getPeople();
	}
	
	public void addPerson(Person person){
		peopleRepo.getPeople().add(person);
		
	}
	
}
