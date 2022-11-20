package com.personpet.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personpet.person.entityclass.Person;
import com.personpet.person.reposiorty.PersonRepository;
import com.personpet.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepo;
	
	@Override
	public Long save(Person person) {
		Person pers = personRepo.save(person);
		return pers.getId();
	}

}
