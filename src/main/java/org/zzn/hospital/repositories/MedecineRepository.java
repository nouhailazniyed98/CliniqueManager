package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Medecine;

public interface MedecineRepository extends JpaRepository<Medecine,Integer> {
}
