package com.personpet.person.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personpet.person.entityclass.Pet;
import com.personpet.person.service.PetService;

@RestController
@RequestMapping("/api/pet")
public class PetController {

	@Autowired
	private PetService petService;
	
	@PostMapping("/savePetDetails")
	public String savePetDetails(@RequestBody Pet pet) {
		
		String petId = petService.save(pet).toString();
		if(petId!=null) {
			return petId;
		}
		return null;
		
	}
	
}
