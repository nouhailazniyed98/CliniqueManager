package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Ordonnance;

import java.util.List;

public interface OrdonnanceService {
        Ordonnance save(Ordonnance ordonnance);
        List<Ordonnance> getAll();
        Ordonnance getById(Long id);
        void delete(Long id);


}
