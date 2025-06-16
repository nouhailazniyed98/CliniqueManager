package org.zzn.hospital.controllers;


import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.Consultation;
import org.zzn.hospital.services.ConsultationService;

import java.util.List;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {

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
    public Consultation createConsultation(@RequestBody ConsultationDTO dto) {
       Consultation consultation = Consultation.builder()
               .diagnostic(dto.getDiagnostic())
               .remarque(dto.getRemarque())
        .build();

        return consultationService.addConsultation(consultation);
    }

    @PutMapping("/{id}")
    public void updateConsultation(@PathVariable Long id, @RequestBody ConsultationDTO dto) {
        Consultation consultation = Consultation.builder()
                .idConsultation(id)
                .diagnostic(dto.getDiagnostic())
                .remarque(dto.getRemarque())
                .build();

        consultationService.updateConsultation(consultation);
    }
    @DeleteMapping("/{id}")
    public void deleteConsultation(@PathVariable Long id) {
        consultationService.deleteConsultation(id);
    }


}
