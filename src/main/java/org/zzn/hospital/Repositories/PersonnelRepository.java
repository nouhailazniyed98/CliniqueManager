package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Personnel;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
}
