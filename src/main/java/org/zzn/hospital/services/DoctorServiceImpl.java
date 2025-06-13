package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.DoctorDto;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.entitys.Patient;
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
    public DoctorDto create(Patient object) {
        return null;
    }

    @Override
    public DoctorDto update(DoctorDto object) {
        return null;
    }

    @Override
    public DoctorDto update(Long aLong, DoctorDto dto) {
        return null;
    }

    @Override
    public DoctorDto delete(Long aLong) {
        return null;
    }

    @Override
    public DoctorDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<DoctorDto> findAll() {
        return List.of();
    }
}
