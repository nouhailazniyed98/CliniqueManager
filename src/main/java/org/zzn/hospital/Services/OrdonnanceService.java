package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Ordonnance;

import java.util.List;

public interface OrdonnanceService {
        Ordonnance addOrdonnance(Ordonnance ordonnance);
        List<Ordonnance> getAllOrdonnance();
        Ordonnance getByIdOrdonnance(Long id);
        void deleteOrdonnance(Long id);
        void updateOrdonnance(Ordonnance ordonnance);


}
