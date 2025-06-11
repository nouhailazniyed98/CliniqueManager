package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.OrdonnanceMedecine;

public interface OrdonnanceMedecineRepository extends JpaRepository<OrdonnanceMedecine, Integer> {
}
