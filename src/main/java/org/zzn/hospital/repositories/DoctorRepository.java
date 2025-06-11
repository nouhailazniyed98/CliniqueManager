package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.enums.Speciality;
import org.zzn.hospital.entitys.Doctor;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Optional<Doctor> findBySpeciality(Speciality speciality);
}
