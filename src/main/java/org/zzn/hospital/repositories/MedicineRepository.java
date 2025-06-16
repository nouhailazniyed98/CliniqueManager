package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}