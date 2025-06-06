package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Medecine;

import java.util.List;

public interface MedecineService {
    Medecine save(Medecine medecine);
    List<Medecine> getAll();
    Medecine getById(Long id);
    void delete(Long id);
}
