package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
