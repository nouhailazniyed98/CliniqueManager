package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Personnel;

import java.util.List;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {

    List<Personnel> findByPostAndService(String post, String service);
}
