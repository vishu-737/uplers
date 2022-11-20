package com.personpet.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personpet.person.entityclass.Pet;
import com.personpet.person.reposiorty.PetRepository;
import com.personpet.person.service.PetService;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetRepository petRepo;
	
	@Override
	public Long save(Pet pet) {
		Pet p = petRepo.save(pet);
		return p.getId();
	}

}
