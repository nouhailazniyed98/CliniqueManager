package org.zzn.hospital.controllers;

import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.services.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private DoctorService doctorService;

    public DoctorController(DoctorService doctorServiceService) {
        this.doctorService = doctorService;
    }
    @PostMapping
    public Doctor addDoctor (@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctor();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctorService.deleteDoctor(id);
    }
}
