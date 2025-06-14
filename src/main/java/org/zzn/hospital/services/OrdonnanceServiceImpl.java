package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.OrdonnanceDto;
import org.zzn.hospital.entitys.Medecine;
import org.zzn.hospital.exceptions.OrdonnanceNotFoundException;
import org.zzn.hospital.entitys.Ordonnance;
import org.zzn.hospital.mappers.OrdonnanceMapper;
import org.zzn.hospital.repositories.MedecineRepository;
import org.zzn.hospital.repositories.OrdonnanceRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class OrdonnanceServiceImpl implements OrdonnanceService {
     private   final  OrdonnanceRepository ordonnanceRepository;
     private final MedecineRepository medecineRepository;
     private final OrdonnanceMapper ordonnanceMapper;

    @Override
    public OrdonnanceDto create(OrdonnanceDto dto) {
        Medecine medecine = medecineRepository.findById(dto.getMedecineId())
                .orElseThrow(() -> new RuntimeException("Medecine not found"));
        Ordonnance ordonnance = ordonnanceMapper.fromDto(dto);
        ordonnance.setMedecine(medecine);
        Ordonnance saved = ordonnanceRepository.save(ordonnance);
        return ordonnanceMapper.toDto(saved);
    }

    @Override
    public OrdonnanceDto update(OrdonnanceDto dto) {
        return update(dto.getIdOrdonnance(), dto);
    }

    @Override
    public OrdonnanceDto update(Long id, OrdonnanceDto dto) {
        Ordonnance ordonnance = ordonnanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordonnance not found"));
        ordonnance.setDate(dto.getDate());
        Medecine medecine = medecineRepository.findById(dto.getMedecineId())
                .orElseThrow(() -> new RuntimeException("Medecine not found"));
        ordonnance.setMedecine(medecine);
        Ordonnance updated = ordonnanceRepository.save(ordonnance);
        return ordonnanceMapper.toDto(updated);
    }

    @Override
    public OrdonnanceDto delete(Long id) {
        Ordonnance ordonnance = ordonnanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordonnance not found"));
        ordonnanceRepository.delete(ordonnance);
        return ordonnanceMapper.toDto(ordonnance);
    }

    @Override
    public OrdonnanceDto findById(Long id) {
        return ordonnanceRepository.findById(id)
                .map(ordonnanceMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Ordonnance not found"));    }

    @Override
    public List<OrdonnanceDto> findAll() {
        return ordonnanceRepository.findAll().stream()
                .map(ordonnanceMapper::toDto)
                .toList();
    }
}
