package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.dtos.PersonnelResponseDto;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.entitys.Personnel;
import org.zzn.hospital.mappers.PersonnelMapper;
import org.zzn.hospital.repositories.PersonnelRepository;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService {
    private final PersonnelRepository personnelRepository;
    private final PersonnelMapper personnelMapper;

    public PersonnelServiceImpl(PersonnelRepository personnelRepository, PersonnelMapper personnelMapper) {
        this.personnelRepository = personnelRepository;
        this.personnelMapper = personnelMapper;
    }

    @Override
    public PersonnelResponseDto create(PersonnelDto personnelDto) {
        Personnel personnel = personnelMapper.fromDto(personnelDto);
        Personnel saved = personnelRepository.save(personnel);
        return personnelMapper.toDto(saved);
    }


    @Override
    public PersonnelResponseDto create(Patient object) {
        return null;
    }

    @Override
    public PersonnelResponseDto update(PersonnelResponseDto object) {
        return null;
    }

    @Override
    public PersonnelResponseDto update(Long aLong, PersonnelResponseDto dto) {
        return null;
    }

    @Override
    public PersonnelResponseDto delete(Long aLong) {
        return null;
    }

    @Override
    public PersonnelResponseDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<PersonnelResponseDto> findAll() {
        return List.of();
    }
}
