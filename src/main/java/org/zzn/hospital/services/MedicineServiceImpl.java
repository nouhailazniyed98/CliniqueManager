package org.zzn.hospital.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.MedicineDto;
import org.zzn.hospital.entitys.Medicine;
import org.zzn.hospital.exceptions.ResourceNotFoundException;
import org.zzn.hospital.mappers.MedicineMapper;
import org.zzn.hospital.repositories.MedicineRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MedicineServiceImpl implements MedicineService {

    private final MedicineRepository repository;
    private final MedicineMapper mapper;

    @Override
    public MedicineDto create(MedicineDto dto) {
        Medicine saved = repository.save(mapper.fromDto(dto));
        return mapper.toDto(saved);
    }

    @Override
    public MedicineDto update(MedicineDto dto) {
        return update(dto.getIdMedicine(), dto);
    }

    @Override
    public MedicineDto update(Long id, MedicineDto dto) {
        Medicine existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Medicine not found with id: " + id));

        existing.setNameMedicine(dto.getNameMedicine());
        existing.setDescription(dto.getDescription());
        existing.setUnite(dto.getUnite());

        return mapper.toDto(repository.save(existing));
    }

    @Override
    public MedicineDto delete(Long id) {
        Medicine med = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Medicine not found with id: " + id));
        repository.delete(med);
        return mapper.toDto(med);
    }

    @Override
    public MedicineDto findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new ResourceNotFoundException("Medicine not found with id: " + id));
    }

    @Override
    public List<MedicineDto> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}