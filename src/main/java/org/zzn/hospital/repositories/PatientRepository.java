package org.zzn.hospital.repositories;

import java.io.Serializable;
import java.lang.ScopedValue;
import java.util.Optional;

import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findPatientById(long id);

    Optional<Object> findPatientByCin(String cin);


}
