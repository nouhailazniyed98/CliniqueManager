package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Appointment;

public interface OutilsRepository extends JpaRepository<Appointment, Integer> {
}
