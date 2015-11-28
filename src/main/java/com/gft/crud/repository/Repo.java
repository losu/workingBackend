package com.gft.crud.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gft.crud.model.Person;

@Repository
public class Repo {

	
	private List<Person> people= new ArrayList<Person>(Arrays.asList(new Person(0, "DAVID", "ARM", "GIUMRI"),
			new Person(1, "Ar", "ARM", "EREVAN"),
			new Person(2, "OV", "ARM", "EREVAN"),
			new Person(3, "ARS", "ARM", "EREVAN")));
		

	public List<Person> getPeople() {
		return people;
	}
	
}
