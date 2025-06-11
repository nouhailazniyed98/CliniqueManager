package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Medecine;

import java.util.List;

public interface MedecineService {
    Medecine save(Medecine medecine);
    List<Medecine> getAll();
    Medecine getById(Long id);
    void delete(Long id);
}
