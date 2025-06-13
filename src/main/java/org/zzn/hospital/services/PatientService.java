package org.zzn.hospital.services;


import org.zzn.hospital.dtos.PatientDto;
import org.zzn.hospital.dtos.PatientResponseDto;

public interface PatientService extends CrudService<PatientResponseDto, Long> {

    PatientResponseDto create(PatientDto patientDto);
}
