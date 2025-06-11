package org.zzn.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.entitys.Consultation;


public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    boolean existsByDiagnostic(String diagnostic);


}
