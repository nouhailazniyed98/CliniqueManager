package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Patient;

import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);

    Patient getPatientById(Long id);

    List<Patient> getAllPatients();

    void updatePatient(Patient patient);

    void deletePatient(int id);

}
