package com.apurv.practice.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apurv.practice.repository.PersonRepository;
import com.apurv.practice.repository.entity.Person;
import com.apurv.practice.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRep;

	@Override
	public Person save(Person person) {
		return personRep.save(person);
	}

	@Override
	public Optional<Person> findById(Long id) {
		return personRep.findById(id);
	}

	@Override
	public Iterable<Person> saveAll(List<Person> list) {
		return personRep.saveAll(list);

	}

	@Override
	public void delete(Long id) {
		personRep.deleteById(id);
	}

	
	@Override
	public void updatePerson(Long id,Person person) {
		//person.setId(id);
		personRep.save(person);
		

	}
	
}
