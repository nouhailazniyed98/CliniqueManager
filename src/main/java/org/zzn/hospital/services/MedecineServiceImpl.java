package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.MedecineDto;
import org.zzn.hospital.exceptions.MedecineALreadyExistsException;
import org.zzn.hospital.exceptions.MedecineNotFoundException;
import org.zzn.hospital.entitys.Medecine;
import org.zzn.hospital.mappers.MedecineMapper;
import org.zzn.hospital.repositories.MedecineRepository;



import java.util.List;
@Service
@AllArgsConstructor
public class MedecineServiceImpl implements MedecineService {
    private final MedecineRepository repository;
    private  final MedecineMapper mapper;

    @Override
    public MedecineDto create(MedecineDto dto) {
        return mapper.toDto(repository.save(mapper.fromDto(dto)));
    }

    @Override
    public MedecineDto update(MedecineDto dto) {
        return update(dto.getIdMedecine(), dto);
    }

    @Override
    public MedecineDto update(Long id, MedecineDto dto) {
        Medecine med = repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
        med.setNameMedecine(dto.getNameMedecine());
        med.setDescription(dto.getDescription());
        med.setUnite(dto.getUnite());
        return mapper.toDto(repository.save(med));
    }

    @Override
    public MedecineDto delete(Long id) {
        Medecine med = repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
        repository.delete(med);
        return mapper.toDto(med);    }

    @Override
    public MedecineDto findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElseThrow(() -> new RuntimeException("Not found"));
    }

    @Override
    public List<MedecineDto> findAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}
