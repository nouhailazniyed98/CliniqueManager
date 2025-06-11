package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Ordonnance;

import java.util.List;

public interface OrdonnanceService {
        Ordonnance save(Ordonnance ordonnance);
        List<Ordonnance> getAll();
        Ordonnance getById(Long id);
        void delete(Long id);


}
