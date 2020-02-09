package com.apurv.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apurv.practice.repository.entity.Person;
import com.apurv.practice.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person save(@RequestBody Person person) {
		return personService.save(person);

	}
	
	@PostMapping(value = "/saveAll",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE )
	public Iterable<Person> saveAll(@RequestBody List<Person> personList){
		return personService.saveAll(personList);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deletePerson(@PathVariable Long id) {
		personService.delete(id);
	}
	
	@PutMapping(value = "/update/{id}")
	public void updatePerson(@PathVariable Long id,@RequestBody Person person) {
		personService.updatePerson(id, person);
		
	}

}
