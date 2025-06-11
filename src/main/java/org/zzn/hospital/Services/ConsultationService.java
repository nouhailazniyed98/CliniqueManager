package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Consultation;

import java.util.List;

public interface ConsultationService {
    Consultation addConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    Consultation getByIdConsultation(Long id);
    void deleteConsultation(Long id);
    void   updateConsultation ( Consultation consultation);
}
