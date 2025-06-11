package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
}
