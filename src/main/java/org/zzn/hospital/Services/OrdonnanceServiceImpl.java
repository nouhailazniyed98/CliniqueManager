package org.zzn.hospital.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.Exceptions.OrdonnanceNotFoundException;
import org.zzn.hospital.Models.Ordonnance;
import org.zzn.hospital.Repositories.OrdonnanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OrdonnanceServiceImpl implements OrdonnanceService {
     private   final  OrdonnanceRepository ordonnanceRepository;

    @Override
    public Ordonnance addOrdonnance(Ordonnance ordonnance) {
        if (ordonnance.getDate() != null && ordonnance.getMedecine() != null &&
                ordonnanceRepository.existsByDateAndMedecine_IdMedecine(
                        ordonnance.getDate(), ordonnance.getMedecine().getIdMedecine())) {
            throw new RuntimeException("Ordonnance for this medecine and date already exists");
        }

        return ordonnanceRepository.save(ordonnance);
    }

    @Override
    public List<Ordonnance> getAllOrdonnance() {
        return ordonnanceRepository.findAll();
    }

    @Override
    public Ordonnance getByIdOrdonnance(Long id) {
        return ordonnanceRepository.findById(id)
                .orElseThrow(() -> new OrdonnanceNotFoundException("Ordonnance not found"));
    }

    @Override
    public void deleteOrdonnance(Long id) {
        if (!ordonnanceRepository.existsById(id)) {
            throw new OrdonnanceNotFoundException("Ordonnance not found");
        }
        ordonnanceRepository.deleteById(id);
    }

    @Override
    public void updateOrdonnance(Ordonnance ordonnance) {
        Ordonnance existing = ordonnanceRepository.findById(ordonnance.getIdOrdonnance())
                .orElseThrow(() -> new OrdonnanceNotFoundException("Ordonnance not found"));

        if (ordonnance.getDate() != null) {
            existing.setDate(ordonnance.getDate());
        }
        if (ordonnance.getMedecine() != null) {
            existing.setMedecine(ordonnance.getMedecine());
        }

        ordonnanceRepository.save(existing);

    }
}
