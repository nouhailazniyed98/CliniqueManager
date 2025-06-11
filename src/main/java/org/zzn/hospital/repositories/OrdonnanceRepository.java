package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Ordonnance;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Integer> {
}
