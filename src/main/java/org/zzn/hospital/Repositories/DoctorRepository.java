package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
