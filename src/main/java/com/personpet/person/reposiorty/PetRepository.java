package com.personpet.person.reposiorty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personpet.person.entityclass.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

}
