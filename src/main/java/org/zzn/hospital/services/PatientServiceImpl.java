package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PatientDto;
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
    public PatientDto create(PatientDto patientDto) {
        if (patientRepository.findPatientByCin(patientDto.getCin()).isPresent()) {
            throw new PatientAlreadyExistExcepetion(patientDto.getCin());
        }
        Patient patient = patientMapper.fromDto(patientDto);
        Patient saved = patientRepository.save(patient);
        return patientMapper.toDto(saved);
    }

    @Override
    public PatientDto update(PatientDto object) {
        return null;
    }

    @Override
    public PatientDto update(Long aLong, PatientDto dto) {
        return null;
    }

    @Override
    public PatientDto delete(Long aLong) {
        return null;
    }

    @Override
    public PatientDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<PatientDto> findAll() {
        return List.of();
    }


}
