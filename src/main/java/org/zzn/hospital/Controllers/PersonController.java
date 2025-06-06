package org.zzn.hospital.Controllers;

import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.Models.Person;
import org.zzn.hospital.Services.PersonService;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person addPerson (@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}
