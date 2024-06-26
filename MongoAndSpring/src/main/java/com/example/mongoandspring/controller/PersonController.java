package com.example.mongoandspring.controller;

import com.example.mongoandspring.model.Person;
import com.example.mongoandspring.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.insertPersonData(person);
    }

    @GetMapping
    public Collection<Person> read() {
        return personService.getAllPersonInformation();
    }

    @GetMapping(path = "{id}")
    public Optional<Person> readQueryUsingId(@PathVariable("id") String id) {
        return personService.getPersonInformationUsingId(id);
    }

    @PutMapping(path = "/update/{id}")
    public void update(@PathVariable String id, @RequestBody Person person) {
        personService.updatePersonUsingId(id, person);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        personService.deletePersonUsingId(id);
    }
}
