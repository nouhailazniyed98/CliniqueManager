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
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrdonnanceServiceImpl implements OrdonnanceService {
     private   final  OrdonnanceRepository ordonnanceRepository;

     private final OrdonnanceMapper ordonnanceMapper;

    @Override
    public OrdonnanceDTO create(OrdonnanceDTO dto) {
        if (dto.getMedecine() == null || dto.getMedecine().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le champ 'medicine' est requis");
        }

        Ordonnance ordonnance = ordonnanceMapper.fromDto(dto);
        ordonnance = ordonnanceRepository.save(ordonnance);
        return ordonnanceMapper.toDto(ordonnance);
    }

    @Override
    public OrdonnanceDTO update(OrdonnanceDTO dto) {

        return update(dto.getIdOrdonnance(), dto);
    }

    @Override
    public OrdonnanceDTO update(Long id, OrdonnanceDTO dto) {
        Ordonnance ordonnance = ordonnanceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ordonnance introuvable"));

        ordonnance.setMedecine(dto.getMedecine());
        ordonnance.setDate(dto.getDate());

        ordonnance = ordonnanceRepository.save(ordonnance);
        return ordonnanceMapper.toDto(ordonnance);
    }

    @Override
    public OrdonnanceDTO delete(Long id) {
        Ordonnance ordonnance = ordonnanceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ordonnance introuvable"));

        ordonnanceRepository.delete(ordonnance);
        return ordonnanceMapper.toDto(ordonnance);
    }

    @Override
    public OrdonnanceDTO findById(Long id) {
        return ordonnanceRepository.findById(id)
                .map(ordonnanceMapper::toDto)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ordonnance introuvable"));
    }

    @Override
    public List<OrdonnanceDTO> findAll() {
        return ordonnanceRepository.findAll()
                .stream()
                .map(ordonnanceMapper::toDto)
                .collect(Collectors.toList());
    }
}
