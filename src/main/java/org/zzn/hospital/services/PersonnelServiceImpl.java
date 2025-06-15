package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.entitys.Personnel;
import org.zzn.hospital.exceptions.PersonnelNotFoundException;
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
    public PersonnelDto update(PersonnelDto dto) {
        if (dto.getService() == null) {
            throw new IllegalArgumentException("Personnel ID must not be null for update.");
        }
        return update(Long.valueOf(dto.getService()), dto);
    }

    @Override
    public PersonnelDto update(Long id, PersonnelDto dto) {
        Personnel existing = personnelRepository.findById(id)
                .orElseThrow(() -> new PersonnelNotFoundException(id));


        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setGender(dto.getGender());
        existing.setPhoneNumber(dto.getPhoneNumber());
        existing.setAddress(dto.getAddress());
        existing.setPost(dto.getPost());


        Personnel saved = personnelRepository.save(existing);
        return personnelMapper.toDto(saved);

    }

    @Override
    public PersonnelDto delete(Long id) {
        Personnel existing = personnelRepository.findById(id)
                .orElseThrow(() -> new PersonnelNotFoundException(id));
        personnelRepository.delete(existing);
        return personnelMapper.toDto(existing);
    }

    @Override
    public PersonnelDto findById(Long id) {
        Personnel personnel = personnelRepository.findById(id)
                .orElseThrow(() -> new PersonnelNotFoundException(id));
        return personnelMapper.toDto(personnel);
    }

    @Override
    public List<PersonnelDto> findAll() {
        return personnelRepository.findAll()
                .stream()
                .map(personnelMapper::toDto)
                .toList();
    }


}
