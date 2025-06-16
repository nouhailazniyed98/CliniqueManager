package org.zzn.hospital.controllers;


import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.ConsultationDTO;
import org.zzn.hospital.entitys.Consultation;
import org.zzn.hospital.services.ConsultationService;


import java.util.List;


@RestController
@RequestMapping("/api/consultations")
public class ConsultationController {

    private final   ConsultationService consultationService;
    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }
    @GetMapping
    public List<ConsultationDTO> getAllConsultations() {
        return consultationService.findAll();
    }

    @GetMapping("/{id}")
    public ConsultationDTO getByIdConsultation(@PathVariable Long id) {
        return consultationService.findById(id );
    }


    @PostMapping
    public ConsultationDTO createConsultation(@RequestBody ConsultationDTO dto) {
        Consultation consultation = Consultation.builder()
                .diagnostic(dto.getDiagnostic())
                .remarque(dto.getRemarque())
                .build();

        return consultationService.create(dto);
    }

    @PutMapping("/{id}")
    public void updateConsultation(@PathVariable Long id, @RequestBody ConsultationDTO dto) {
        Consultation consultation = Consultation.builder()
                .idConsultation(id)
                .diagnostic(dto.getDiagnostic())
                .remarque(dto.getRemarque())
                .build();

        consultationService.update( dto);

    }


    @DeleteMapping("/{id}")
    public ConsultationDTO deleteConsultation(@PathVariable Long id) {

        return consultationService.delete(id);
    }


}
