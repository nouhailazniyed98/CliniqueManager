package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.entitys.OrdonnanceMedecine;

import java.util.List;
@Service
public class OrdonnanceMedecineServiceImpl implements  OrdonnanceMedecineService {
    @Override
    public OrdonnanceMedecine save(OrdonnanceMedecine ordonnanceMedecine) {
        return null;
    }

    @Override
    public OrdonnanceMedecine getById(Long id) {
        return null;
    }

    @Override
    public List<OrdonnanceMedecine> getAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
