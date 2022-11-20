package com.personpet.person.reposiorty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personpet.person.entityclass.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
