package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.OrdonnanceMedecineDto;
import org.zzn.hospital.exceptions.OrdonnanceMedecinNotFoundException;
import org.zzn.hospital.exceptions.OrdonnanceNotFoundException;
import org.zzn.hospital.entitys.OrdonnanceMedecine;
import org.zzn.hospital.mappers.OrdonnanceMedecineMapper;
import org.zzn.hospital.repositories.OrdonnanceMedecineRepository;
import java.util.List;
@Service
@AllArgsConstructor
public class OrdonnanceMedecineServiceImpl implements  OrdonnanceMedecineService {
    private final OrdonnanceMedecineRepository repository;
    private final OrdonnanceMedecineMapper mapper;

    @Override
    public OrdonnanceMedecineDto create(OrdonnanceMedecineDto dto) {
        return mapper.toDto(repository.save(mapper.fromDto(dto)));
    }

    @Override
    public OrdonnanceMedecineDto update(OrdonnanceMedecineDto dto) {
        return update(dto.getIdOrdonnanceMedecine(), dto);
    }

    @Override
    public OrdonnanceMedecineDto update(Long id, OrdonnanceMedecineDto dto) {
        OrdonnanceMedecine entity = repository.findById(id).orElseThrow();
        entity.setQuantity(dto.getQuantity());
        entity.setDausage(dto.getDausage());
        return mapper.toDto(repository.save(entity));    }

    @Override
    public OrdonnanceMedecineDto delete(Long id) {
        OrdonnanceMedecine entity = repository.findById(id).orElseThrow();
        repository.delete(entity);
        return mapper.toDto(entity);    }

    @Override
    public OrdonnanceMedecineDto findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElseThrow();

    }

    @Override
    public List<OrdonnanceMedecineDto> findAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}
