package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Medecine;

import java.util.List;

public interface MedecineService {
    Medecine addMedecine(Medecine medecine);
    List<Medecine> getAllMedecine();
    Medecine getByIdMedecine(Long id);
    void deleteMedecine(Long id);
    void updateMedecine(Medecine medecine);
}
