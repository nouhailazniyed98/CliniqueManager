package org.zzn.hospital.controllers;

import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.PatientResponseDto;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.services.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @PostMapping
    public PatientResponseDto addPatient (@RequestBody Patient patient) {
        return patientService.create(patient);
    }

    @GetMapping
    public Class<? extends PatientService> getAllPatients() {
        return patientService.getClass();
    }

    @GetMapping("/{id}")
    public PatientResponseDto getPatientById(@PathVariable PatientResponseDto id) {
        return patientService.update(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.delete((long) id);
        }

    @GetMapping("/test")
    public String test() {
        return "API function !";
    }
}
