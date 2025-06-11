package org.zzn.hospital.Controllers;

import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.services.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @PostMapping
    public Patient addPatient (@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
        }

    @GetMapping("/test")
    public String test() {
        return "API fonctionne !";
    }
}
