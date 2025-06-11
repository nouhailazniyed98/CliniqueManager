package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.exceptions.MedecineALreadyExistsException;
import org.zzn.hospital.exceptions.MedecineNotFoundException;
import org.zzn.hospital.entitys.Medecine;
import org.zzn.hospital.repositories.MedecineRepository;



import java.util.List;
@Service
@AllArgsConstructor
public class MedecineServiceImpl implements MedecineService {
    public final MedecineRepository medecineRepository;
    @Override
    public Medecine addMedecine(Medecine medecine) {
       if (medecine.getNameMedecine() != null &&
               medecineRepository.existsByNameMedecine(medecine.getNameMedecine())) {
     throw new MedecineALreadyExistsException("Medecine already exists");
       }
       return medecineRepository.save(medecine);
    }

    @Override
    public List<Medecine> getAllMedecine() {
        return medecineRepository.findAll();
    }

    @Override
    public Medecine getByIdMedecine(Long id) {
        return medecineRepository.findById(id)
                .orElseThrow(() -> new MedecineNotFoundException("Medecin not found "));
    }

    @Override
    public void deleteMedecine(Long id) {
     if (! medecineRepository.existsById(id)) {
        throw new MedecineNotFoundException("Medecine not found ");
     }
        medecineRepository.deleteById(id);
    }

    @Override
    public void updateMedecine(Medecine medecine) {
        Medecine existing = medecineRepository.findById(medecine.getIdMedecine())
                .orElseThrow(() -> new MedecineNotFoundException("Medecine not found"));

        if (medecine.getNameMedecine() != null) {
            existing.setNameMedecine(medecine.getNameMedecine());
        }
        if (medecine.getDescription() != null) {
            existing.setDescription(medecine.getDescription());
        }
        if (medecine.getUnite() > 0) {
            existing.setUnite(medecine.getUnite());
        }

        medecineRepository.save(existing);
    }

}
