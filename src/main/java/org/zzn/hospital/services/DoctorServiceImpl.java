package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.DoctorDto;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.exceptions.DoctorNotFoundException;
import org.zzn.hospital.mappers.DoctorMapper;
import org.zzn.hospital.repositories.DoctorRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    @Override
    public DoctorDto create(DoctorDto doctorDto) {

        Doctor doctor = doctorMapper.fromDto(doctorDto);
        Doctor saved = doctorRepository.save(doctor);
        return doctorMapper.toDto(saved);
    }

    @Override
    public DoctorDto update(DoctorDto dto) {
        if (dto.getId() == null) {
            throw new IllegalArgumentException("Doctor ID must not be null for update.");
        }
        return update(dto.getId(), dto);
    }

    @Override
    public DoctorDto update(Long id, DoctorDto dto) {
        Doctor existing = doctorRepository.findById(id)
                .orElseThrow(() -> new DoctorNotFoundException(id));

        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setSpeciality(dto.getSpeciality());
        existing.setAddress(dto.getAddress());
        existing.setAddress(dto.getAddress());
        existing.setBirthday(dto.getBirthday());
        existing.setGender(dto.getGender());
        existing.setPhoneNumber(dto.getPhoneNumber());


        Doctor saved = doctorRepository.save(existing);
        return doctorMapper.toDto(saved);
    }

    @Override
    public DoctorDto delete(Long id) {
        Doctor existing = doctorRepository.findById(id)
                .orElseThrow(() -> new DoctorNotFoundException(id));
        doctorRepository.delete(existing);
        return doctorMapper.toDto(existing);
    }

    @Override
    public DoctorDto findById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new DoctorNotFoundException(id));
        return doctorMapper.toDto(doctor);
    }

    @Override
    public List<DoctorDto> findAll() {
        return doctorRepository.findAll()
                .stream()
                .map(doctorMapper::toDto)
                .toList();
    }
}

