package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Consultation;

import java.util.List;

public interface ConsultationService {
    Consultation addConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    Consultation getByIdConsultation(Long id);
    void deleteConsultation(Long id);
    void   updateConsultation ( Consultation consultation);
}
