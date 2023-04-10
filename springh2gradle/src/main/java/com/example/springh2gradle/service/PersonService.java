package com.example.springh2gradle.service;

import com.example.springh2gradle.model.Person;
import com.example.springh2gradle.repository.PersonRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Could not find person with id: " + id));
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person updatePerson(Long id, Person person) {
        Person existingPerson = getPersonById(id);
        existingPerson.setFirstName(person.getFirstName());
        existingPerson.setLastName(person.getLastName());
        existingPerson.setAge(person.getAge());
        return personRepository.save(existingPerson);

//        return personRepository.findById(id)
//                .map(person -> {
//                    person.setFirstName(updatePerson.getFirstName());
//                    person.setLastName(updatePerson.getLastName());
//                    person.setAge(updatePerson.getAge());
//                    return personRepository.save(updatePerson);
//                })
//                .orElseGet(() -> {
//                    updatePerson.setId(id);
//                    return personRepository.save(updatePerson);
//                });
    }

    public void deletePerson(Long id) {
        getPersonById(id);
        personRepository.deleteById(id);
    }
}
