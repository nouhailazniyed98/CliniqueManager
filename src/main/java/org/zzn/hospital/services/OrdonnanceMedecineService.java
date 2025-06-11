package org.zzn.hospital.services;

import org.zzn.hospital.entitys.OrdonnanceMedecine;

import java.util.List;

public interface OrdonnanceMedecineService {
    OrdonnanceMedecine save(OrdonnanceMedecine ordonnanceMedecine);
    List<OrdonnanceMedecine> getAll();
    OrdonnanceMedecine getById(Long id);
    void delete(Long id);
}
