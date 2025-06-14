package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Appointment;
import org.zzn.hospital.entitys.Outils;

public interface OutilsRepository extends JpaRepository<Outils, Integer> {
}
