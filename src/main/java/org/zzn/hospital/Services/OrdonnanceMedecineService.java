package org.zzn.hospital.Services;

import org.zzn.hospital.Models.OrdonnanceMedecine;

import java.util.List;

public interface OrdonnanceMedecineService {
    OrdonnanceMedecine addOrdonnanceMedecine(OrdonnanceMedecine ordonnanceMedecine);
    List<OrdonnanceMedecine> getAllOrdonnanceMedecine();
    OrdonnanceMedecine getByIdOrdonnanceMedecine(Long id);
    void deleteOrdonnanceMedecine(Long id);
    void updateOrdonnanceMedecine(OrdonnanceMedecine ordonnanceMedecine);
}
