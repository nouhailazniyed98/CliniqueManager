package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor addDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    Void deleteDoctor(int doctor);
    Doctor getDoctorById(long id);
    List<Doctor> getAllDoctor();
}
