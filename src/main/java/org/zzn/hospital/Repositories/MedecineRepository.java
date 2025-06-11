package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Medecine;

public interface MedecineRepository extends JpaRepository<Medecine,Long> {
     boolean existsByNameMedecine(String nameMedecine);
}
