package org.zzn.hospital.Controllers;

import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.Models.Patient;
import org.zzn.hospital.Models.Personnel;
import org.zzn.hospital.Services.PatientService;
import org.zzn.hospital.Services.PersonnelService;

import java.util.List;

@RestController
@RequestMapping("/api/personnels")
public class PersonnelController {
    private final PatientService patientService;
    private final PersonnelService personnelService;

    public PersonnelController(PatientService patientService, PersonnelService personnelService) {
        this.patientService = patientService;
        this.personnelService = personnelService;
    }
    @PostMapping
    public Personnel addPersonnel (@RequestBody Personnel personnel) {
        return personnelService.addPersonnel(personnel);
    }

    @GetMapping
    public List<Personnel> getAllPersonnel() {
        return personnelService.getAllPersonnels();
    }

    @GetMapping("/{id}")
    public Personnel getPersonnelById(@PathVariable Long id) {
        return personnelService.getPersonnelById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
    }

}
