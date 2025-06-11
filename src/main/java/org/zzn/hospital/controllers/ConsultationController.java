package org.zzn.hospital.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.Consultation;
import org.zzn.hospital.services.ConsultationService;

import java.util.List;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {
    @Autowired
    private ConsultationService consultationService;

    @GetMapping
    public List<Consultation> getAll() {
        return consultationService.getAll();
    }

    @GetMapping("/{id}")
    public Consultation getById(@PathVariable Long id) {
        return consultationService.getById(id);
    }

    @PostMapping
    public Consultation create(@RequestBody Consultation ac) {
        return consultationService.save(ac);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        consultationService.delete(id);
    }
}
