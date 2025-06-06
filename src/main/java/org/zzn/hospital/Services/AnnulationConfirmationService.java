package org.zzn.hospital.Services;

import org.zzn.hospital.Models.AnnulationConfirmation;

import java.util.List;

public interface AnnulationConfirmationService {
    AnnulationConfirmation save(AnnulationConfirmation ac);
    List<AnnulationConfirmation> getAll();
    AnnulationConfirmation getById(Long id);
    void delete(Long id);
}
