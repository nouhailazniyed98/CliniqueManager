package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Ordonnance;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Integer> {
}
