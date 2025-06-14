package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.OutilsDto;
import org.zzn.hospital.entitys.Outils;
import org.zzn.hospital.mappers.OutilsMapper;
import org.zzn.hospital.repositories.OutilsRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class OutilsServiceImpl implements OutilsService {
    private final OutilsRepository repository;
    private final OutilsMapper mapper;

    @Override
    public OutilsDto create(OutilsDto dto) {
        return mapper.toDto(repository.save(mapper.fromDto(dto)));
    }

    @Override
    public OutilsDto update(OutilsDto dto) {
        return update(dto.getIdOutils(), dto);
    }

    @Override
    public OutilsDto update(Integer id, OutilsDto dto) {
        Outils entity = repository.findById(id).orElseThrow();
        entity.setNameOutils(dto.getNameOutils());
        entity.setDescription(dto.getDescription());
        entity.setAvailibility(dto.isAvailability());
        return mapper.toDto(repository.save(entity));    }

    @Override
    public OutilsDto delete(Integer id) {
        Outils entity = repository.findById(id).orElseThrow();
        repository.delete(entity);
        return mapper.toDto(entity);    }

    @Override
    public OutilsDto findById(Integer id) {
        return repository.findById(id).map(mapper::toDto).orElseThrow();
    }

    @Override
    public List<OutilsDto> findAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }


}
