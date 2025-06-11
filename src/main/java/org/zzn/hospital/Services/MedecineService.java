package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Medecine;

import java.util.List;

public interface MedecineService {
    Medecine addMedecine(Medecine medecine);
    List<Medecine> getAllMedecine();
    Medecine getByIdMedecine(Long id);
    void deleteMedecine(Long id);
    void updateMedecine(Medecine medecine);
}
