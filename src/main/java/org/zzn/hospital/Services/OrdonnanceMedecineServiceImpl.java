package org.zzn.hospital.Services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.Models.OrdonnanceMedecine;

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
