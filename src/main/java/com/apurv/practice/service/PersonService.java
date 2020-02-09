package com.apurv.practice.service;

import java.util.List;
import java.util.Optional;

import com.apurv.practice.repository.entity.Person;

public interface PersonService {
	Person save(Person person);
	Iterable<Person> saveAll(List<Person> list);
	Optional<Person> findById(Long id);
	void delete(Long id);
	void updatePerson(Long id,Person person);
}
