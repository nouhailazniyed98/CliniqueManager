package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Enums.TypeAction;
import org.zzn.hospital.entitys.AnnulationConfirmation;

import java.util.List;

public interface AnnulationConfirmationRepository extends JpaRepository<AnnulationConfirmation,Integer> {

    List<AnnulationConfirmation> findByTypeAction(TypeAction typeAction);
}
