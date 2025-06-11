package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Ordonnance;

import java.time.LocalDate;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long> {
    boolean existsByDateAndMedecine_IdMedecine(LocalDate date, Long idMedecine);

}
