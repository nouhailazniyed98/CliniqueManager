package org.zzn.hospital.Services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.Models.Patient;
import org.zzn.hospital.Repositories.PatientRepository;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    protected PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    @Override
    public Patient addPatient(Patient patient) {

        return patient;
    }

    @Override
    public Patient getPatientById(Long id) {
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return List.of();
    }

    @Override
    public void updatePatient(Patient patient) {

    }

    @Override
    public void deletePatient(int id) {

    }
}
