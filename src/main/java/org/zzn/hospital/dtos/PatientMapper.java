package org.zzn.hospital.dtos;

import org.mapstruct.Mapper;
import org.zzn.hospital.entitys.Patient;

import java.util.List;

@Mapper(componentModel = "spring", uses = InsuranceMapper.class)
public interface PatientMapper {

    Patient fromCreateDto(CreatePatientDto dto);

    PatientResponseDto toDto(Patient patient);

    List<PatientResponseDto> toDtoList(List<Patient> patients);
}

