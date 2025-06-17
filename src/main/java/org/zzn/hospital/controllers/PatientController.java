package org.zzn.hospital.controllers;

import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.PatientDto;
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
    public PatientDto addPatient (@RequestBody PatientDto patient) {
        return patientService.create(patient);
    }

    @GetMapping
    public Class<? extends PatientService> getAllPatients() {
        return patientService.getClass();
    }

    @GetMapping("/{id}")
    public PatientDto getPatientById(@PathVariable PatientDto id) {
        return patientService.update(id);
    }

    @PutMapping("/{id}")
    public PatientDto updatePatient(@PathVariable Long id, @RequestBody PatientDto patient) {
        return patientService.update(id, patient);
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
