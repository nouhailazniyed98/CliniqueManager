package org.zzn.hospital.services;


import org.zzn.hospital.dtos.PatientDto;

public interface PatientService extends CrudService<PatientDto, Long> {

    PatientDto create(PatientDto patientDto);
}
