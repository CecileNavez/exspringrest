package be.abis.exercise.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.abis.exercise.exception.PersonCanNotBeDeletedException;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.PersonService;

@RestController
@RequestMapping("persons")
public class PersonController {

	@Autowired
	PersonService personService;
	
	Person PersonToLog;
			
	@GetMapping("{id}")
	public Person findPersonById(@PathVariable("id") int id) {
		return personService.findPerson(id);
	}
	
	@GetMapping("")
	public ArrayList<Person> findAllPersons() {
		return personService.getAllPersons();
	}
	
	@DeleteMapping("{id}")
	public void removePersonById(@PathVariable("id") int id) throws PersonCanNotBeDeletedException {
		personService.deletePerson(id);
	}
	
	@PostMapping("")
	public void addPerson(@RequestBody Person p)  {
		try {
			personService.addPerson(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping("{id}")
	public void changePassword(@PathVariable("id") int id, @RequestBody Person p) {
		try {
			personService.changePassword(p, p.getPassword());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// login : does not work
	@PostMapping("/login")
	public Person submitLogin(@RequestBody Person p) {
		PersonToLog = personService.findPerson(p.getEmailAddress(), p.getPassword());
		return PersonToLog.findPerson(loggedPerson.getEmailAddress(), p.getPassword());
	}
	
	
}
