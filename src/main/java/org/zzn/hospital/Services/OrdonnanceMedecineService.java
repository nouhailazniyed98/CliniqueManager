package org.zzn.hospital.Services;

import org.zzn.hospital.Models.OrdonnanceMedecine;

import java.util.List;

public interface OrdonnanceMedecineService {
    OrdonnanceMedecine save(OrdonnanceMedecine ordonnanceMedecine);
    List<OrdonnanceMedecine> getAll();
    OrdonnanceMedecine getById(Long id);
    void delete(Long id);
}
