package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.DoctorDto;
import org.zzn.hospital.dtos.DoctorResponseDto;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.exceptions.PatientAlreadyExistExcepetion;
import org.zzn.hospital.mappers.DoctorMapper;
import org.zzn.hospital.repositories.DoctorRepository;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    public DoctorServiceImpl(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }


    @Override
    public DoctorResponseDto create(DoctorDto doctorDto) {

        Doctor doctor = doctorMapper.fromDto(doctorDto);
        Doctor saved = doctorRepository.save(doctor);
        return doctorMapper.toDto(saved);
    }

    @Override
    public DoctorResponseDto create(Patient object) {
        return null;
    }

    @Override
    public DoctorResponseDto update(DoctorResponseDto object) {
        return null;
    }

    @Override
    public DoctorResponseDto update(Long aLong, DoctorResponseDto dto) {
        return null;
    }

    @Override
    public DoctorResponseDto delete(Long aLong) {
        return null;
    }

    @Override
    public DoctorResponseDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<DoctorResponseDto> findAll() {
        return List.of();
    }
}
