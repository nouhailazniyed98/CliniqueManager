package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.entitys.Personnel;
import org.zzn.hospital.repositories.PersonnelRepository;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService {
    private final PersonnelRepository personnelRepository;

    public PersonnelServiceImpl(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }


    @Override
    public PersonnelDto create(PersonnelDto object) {
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
