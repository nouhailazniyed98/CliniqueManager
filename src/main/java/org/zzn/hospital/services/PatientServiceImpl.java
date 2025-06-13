package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PatientDto;
import org.zzn.hospital.dtos.PatientResponseDto;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.exceptions.PatientAlreadyExistExcepetion;
import org.zzn.hospital.mappers.PatientMapper;
import org.zzn.hospital.repositories.PatientRepository;

import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    @Override
    public PatientResponseDto create(PatientDto patientDto) {
        if (patientRepository.findPatientByCin(patientDto.getCin()).isPresent()) {
            throw new PatientAlreadyExistExcepetion(patientDto.getCin());
        }
        Patient patient = patientMapper.fromDto(patientDto);
        Patient saved = patientRepository.save(patient);
        return patientMapper.toDto(saved);
    }

    @Override
    public PatientResponseDto create(Patient object) {
        return null;
    }

    @Override
    public PatientResponseDto update(PatientResponseDto object) {
        return null;
    }

    @Override
    public PatientResponseDto update(Long aLong, PatientResponseDto dto) {
        return null;
    }

    @Override
    public PatientResponseDto delete(Long aLong) {
        return null;
    }

    @Override
    public PatientResponseDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<PatientResponseDto> findAll() {
        return List.of();
    }
}
