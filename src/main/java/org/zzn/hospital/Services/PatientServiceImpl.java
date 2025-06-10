package org.zzn.hospital.Services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.Exceptions.PatientAlreadyExistExcepetion;
import org.zzn.hospital.Models.Patient;
import org.zzn.hospital.Repositories.PatientRepository;

import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository; // Dependency Injcetion With constructor

    @Override
    public Patient addPatient(Patient patient) {
        if (patientRepository.findPatientByCin(patient.getCin()).isPresent()) {
            throw new PatientAlreadyExistExcepetion();
        }
        return patientRepository.save(patient);//save in Database + return value
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void updatePatient(Patient patient) {
        Patient tmp = this.getPatientById(patient.getId());
        patientRepository.save(tmp.builder()
        .bloodType(patient.getBloodType())
        .cin(patient.getCin())
        .build());
    }

    @Override
    public void deletePatient(int id) {

    }
}
