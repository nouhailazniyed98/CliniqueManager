package org.zzn.hospital.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findPatientByCin(String cin);
}
