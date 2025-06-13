package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.entitys.Personnel;
import org.zzn.hospital.mappers.PersonnelMapper;
import org.zzn.hospital.repositories.PersonnelRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonnelServiceImpl implements PersonnelService {
    private final PersonnelRepository personnelRepository;
    private final PersonnelMapper personnelMapper;



    @Override
    public PersonnelDto create(PersonnelDto personnelDto) {
        Personnel personnel = personnelMapper.fromDto(personnelDto);
        Personnel saved = personnelRepository.save(personnel);
        return personnelMapper.toDto(saved);
    }

    @Override
    public PersonnelDto create(Patient object) {
        return null;
    }

    @Override
    public PersonnelDto update(PersonnelDto object) {
        return null;
    }

    @Override
    public PersonnelDto update(Long aLong, PersonnelDto dto) {
        return null;
    }

    @Override
    public PersonnelDto delete(Long aLong) {
        return null;
    }

    @Override
    public PersonnelDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<PersonnelDto> findAll() {
        return List.of();
    }
}
