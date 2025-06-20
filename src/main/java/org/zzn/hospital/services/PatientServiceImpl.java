package org.zzn.hospital.services;

import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PatientDto;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.exceptions.PatientAlreadyExistExcepetion;
import org.zzn.hospital.exceptions.PatientNotFoundException;
import org.zzn.hospital.mappers.PatientMapper;
import org.zzn.hospital.repositories.PatientRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@AllArgsConstructor
@Log
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
    public PatientDto update(PatientDto patientDto) {
        Patient existing = (Patient) patientRepository.findPatientByCin(patientDto.getCin())
                .orElseThrow(() -> new PatientNotFoundException(patientDto.getCin()));
        Patient updated = patientMapper.fromDto(patientDto);
        updated.setId(existing.getId());
        Patient saved = patientRepository.save(updated);
        return patientMapper.toDto(saved);

    }

    @Override
    public PatientDto update(Long id, PatientDto dto) {
        Patient existing = patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
        Patient patient = patientMapper.fromDto(dto);
        patient.setId(id);
        Patient saved = patientRepository.save(patient);
        return patientMapper.toDto(saved);
    }

    @Override
    public PatientDto delete(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
        patientRepository.delete(patient);
        return patientMapper.toDto(patient);
    }

    @Override
    public PatientDto findById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
        return patientMapper.toDto(patient);
    }

    @Override
    public List<PatientDto> findAll() {
        return patientRepository.findAll()
                .stream()
                .map(patientMapper::toDto)
                .toList();

    }


}
