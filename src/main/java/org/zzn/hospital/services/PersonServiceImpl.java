package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.entitys.Person;
import org.zzn.hospital.Repositories.PersonRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person addPerson(Person person) {

        return person;
    }

    @Override
    public Person getPersonById(Long id) {
        return null;
    }

    @Override
    public List<Person> getAllPersons() {
        return List.of();
    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePerson(Long id) {

    }
}
