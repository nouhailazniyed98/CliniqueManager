package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.zzn.hospital.dtos.OrdonnanceDTO;
import org.zzn.hospital.entitys.Medicine;
import org.zzn.hospital.entitys.Ordonnance;
import org.zzn.hospital.mappers.OrdonnanceMapper;
import org.zzn.hospital.repositories.MedicineRepository;
import org.zzn.hospital.repositories.OrdonnanceRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class OrdonnanceServiceImpl implements OrdonnanceService {
     private   final  OrdonnanceRepository ordonnanceRepository;
     private final MedicineRepository medecineRepository;
     private final OrdonnanceMapper ordonnanceMapper;

    @Override
    public OrdonnanceDTO create(OrdonnanceDTO dto) {
        if (dto.getMedecine() == null || dto.getMedecine().getIdMedicine() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le champ 'medecine.idMedicine' est requis");
        }

        Medicine medecine = medecineRepository.findById(dto.getMedecine().getIdMedicine())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Médecine introuvable"));

        Ordonnance ordonnance = ordonnanceMapper.fromDto(dto);
        ordonnance.setMedecine(medecine);

        Ordonnance saved = ordonnanceRepository.save(ordonnance);
        return ordonnanceMapper.toDto(saved);
    }

    @Override
    public OrdonnanceDTO update(OrdonnanceDTO dto) {
        return update(dto.getIdOrdonnance(), dto);
    }

    @Override
    public OrdonnanceDTO update(Long id, OrdonnanceDTO dto) {
        Ordonnance ordonnance = ordonnanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordonnance not found"));
        ordonnance.setDate(dto.getDate());
        Medicine medecine = medecineRepository.findById(dto.getMedecine().getIdMedicine())
                .orElseThrow(() -> new RuntimeException("Medecine not found"));
        ordonnance.setMedecine(medecine);
        Ordonnance updated = ordonnanceRepository.save(ordonnance);
        return ordonnanceMapper.toDto(updated);
    }

    @Override
    public OrdonnanceDTO delete(Long id) {
        Ordonnance ordonnance = ordonnanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordonnance not found"));
        ordonnanceRepository.delete(ordonnance);
        return ordonnanceMapper.toDto(ordonnance);
    }

    @Override
    public OrdonnanceDTO findById(Long id) {
        return ordonnanceRepository.findById(id)
                .map(ordonnanceMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Ordonnance not found"));    }

    @Override
    public List<OrdonnanceDTO> findAll() {
        return ordonnanceRepository.findAll()
                .stream()
                .map(ordonnanceMapper::toDto)
                .toList();
    }
}
