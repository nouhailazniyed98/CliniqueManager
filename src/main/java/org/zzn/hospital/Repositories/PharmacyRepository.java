package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
}
