package org.zzn.hospital.services;

import org.zzn.hospital.entitys.AnnulationConfirmation;

import java.util.List;

public interface AnnulationConfirmationService {
    AnnulationConfirmation save(AnnulationConfirmation ac);
    List<AnnulationConfirmation> getAll();
    AnnulationConfirmation getById(Long id);
    void delete(Long id);
}
