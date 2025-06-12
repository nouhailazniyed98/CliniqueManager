package org.zzn.hospital.services;

import org.zzn.hospital.dtos.PatientResponseDto;
import org.zzn.hospital.entitys.Patient;

import java.util.List;


public interface PatientService extends CrudService<PatientResponseDto, Long> {


    Patient addPatient(Patient patient);

    Patient getPatientById(Long id);

    List<Patient> getAllPatients();

    void updatePatient(Patient patient);
}
