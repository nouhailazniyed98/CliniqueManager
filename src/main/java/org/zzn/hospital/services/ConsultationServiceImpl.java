package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.exceptions.ConsultationAlreadyExistsException;
import org.zzn.hospital.exceptions.ConsultationNotFoundException;
import org.zzn.hospital.entitys.Consultation;
import org.zzn.hospital.repositories.ConsultationRepository;
import org.zzn.hospital.entitys.Consultation;

import java.util.List;
@Service
@AllArgsConstructor

public class ConsultationServiceImpl implements  ConsultationService {

    private final ConsultationRepository consultationRepository;

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public Consultation getByIdConsultation(Long id) {
        return consultationRepository.findById(id)
                .orElseThrow(() -> new ConsultationNotFoundException("Consultation not found"));
    }

    @Override
    public void deleteConsultation(Long id) {
        if (!consultationRepository.existsById(id)) {
            throw new ConsultationNotFoundException("Consultation not found");
        }
        consultationRepository.deleteById(id);
    }

    @Override
    public Consultation addConsultation(Consultation consultation) {
        if (consultation.getDiagnostic() != null &&
                consultationRepository.existsByDiagnostic(consultation.getDiagnostic())) {
            throw new ConsultationAlreadyExistsException("Diagnostic already exists");
        }

        return consultationRepository.save(consultation);
    }

    @Override
    public void updateConsultation(Consultation consultation) {
        Consultation existing = consultationRepository.findById(consultation.getIdConsultation())
                .orElseThrow(() -> new ConsultationNotFoundException("Consultation not found"));

        if (consultation.getDiagnostic() != null) {
            existing.setDiagnostic(consultation.getDiagnostic());
        }
        if (consultation.getRemarque() != null) {
            existing.setRemarque(consultation.getRemarque());
        }

        consultationRepository.save(existing);
    }
}

