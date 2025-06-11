package org.zzn.hospital.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findPatientByCin(String cin);
}
