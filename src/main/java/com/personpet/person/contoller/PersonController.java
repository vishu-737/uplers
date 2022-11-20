package com.personpet.person.contoller;

import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personpet.person.entityclass.Person;
import com.personpet.person.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired 
	private PersonService personService;
	
	@PostMapping("/savePersonDetails")
	@Consumes()
	public String savePersonDetails(@RequestBody Person person) {
		
		String personId = personService.save(person).toString();
		if(personId!=null) {
			return personId;
		}
		return null;
		
	}
	
}
