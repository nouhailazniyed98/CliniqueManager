package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
