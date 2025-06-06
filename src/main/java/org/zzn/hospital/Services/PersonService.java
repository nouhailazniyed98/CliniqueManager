package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Person;

import java.util.List;

public interface PersonService {
    Person addPerson(Person person);
    Person getPersonById(Long id);
    List<Person> getAllPersons();
    void updatePerson(Person person);
    void deletePerson(Long id);
}
