package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
}
