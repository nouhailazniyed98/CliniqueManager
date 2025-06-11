package org.zzn.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.Medecine;
import org.zzn.hospital.services.MedecineService;

import java.util.List;

@RestController
@RequestMapping("/medecines")
public class MedecineController {
    @Autowired
    private MedecineService medecineService;

    @GetMapping
    public List<Medecine> getAllMedecine() {
        return medecineService.getAllMedecine();
    }

    @GetMapping("/{id}")
    public Medecine getByIdMedecine(@PathVariable Long id) {
        return medecineService.getByIdMedecine(id);
    }

    @PostMapping
    public Medecine createMedecine(@RequestBody Medecine me) {
        return medecineService.addMedecine(me);
    }

    @PutMapping
    public void  updateMedecine(@RequestBody Medecine me) {
        medecineService.updateMedecine(me);
    }

    @DeleteMapping("/{id}")
    public void deleteMedecine(@PathVariable Long id) {
        medecineService.deleteMedecine(id);
    }
}
