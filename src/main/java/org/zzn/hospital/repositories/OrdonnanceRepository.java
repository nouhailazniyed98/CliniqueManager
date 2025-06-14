package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Ordonnance;

import java.time.LocalDate;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long> {

}
