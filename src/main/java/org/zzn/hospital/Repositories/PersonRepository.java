package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
