package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.entitys.AnnulationConfirmation;

import java.util.List;

@Service
public class AnnulationConfirmationServiceImpl implements AnnulationConfirmationService {
    @Override
    public AnnulationConfirmation save(AnnulationConfirmation ac) {
        return null;
    }

    @Override
    public List<AnnulationConfirmation> getAll() {
        return List.of();
    }

    @Override
    public AnnulationConfirmation getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
