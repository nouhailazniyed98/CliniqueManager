package org.zzn.hospital.services;

import org.zzn.hospital.entitys.OrdonnanceMedecine;

import java.util.List;

public interface OrdonnanceMedecineService {
    OrdonnanceMedecine addOrdonnanceMedecine(OrdonnanceMedecine ordonnanceMedecine);
    List<OrdonnanceMedecine> getAllOrdonnanceMedecine();
    OrdonnanceMedecine getByIdOrdonnanceMedecine(Long id);
    void deleteOrdonnanceMedecine(Long id);
    void updateOrdonnanceMedecine(OrdonnanceMedecine ordonnanceMedecine);
}
