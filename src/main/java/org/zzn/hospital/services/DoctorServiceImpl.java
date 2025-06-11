package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.repositories.DoctorRepository;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {

        return doctor;
    }

    @Override
    public void updateDoctor(Doctor doctor) {

    }

    @Override
    public Void deleteDoctor(int doctor) {
        return null;
    }

    @Override
    public Doctor getDoctorById(long id) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return List.of();
    }

}
