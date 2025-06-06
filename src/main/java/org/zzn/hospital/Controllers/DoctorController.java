package org.zzn.hospital.Controllers;

import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.Models.Doctor;
import org.zzn.hospital.Models.Patient;
import org.zzn.hospital.Services.DoctorService;
import org.zzn.hospital.Services.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
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
