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
    public List<Consultation> getAllConsultations() {

        return consultationService.getAllConsultations();
    }

    @GetMapping("/{id}")
    public Consultation getByIdConsultation(@PathVariable Long id) {
        return consultationService.getByIdConsultation(id);
    }


    @PostMapping
    public Consultation createConsultation(@RequestBody Consultation ac) {
        return consultationService.addConsultation(ac);
    }

    @PutMapping
    public void updateConsultation(@RequestBody Consultation consultation) {
        consultationService.updateConsultation(consultation);
    }

    @DeleteMapping("/{id}")
    public void deleteConsultation(@PathVariable Long id) {
        consultationService.deleteConsultation(id);
    }


}
