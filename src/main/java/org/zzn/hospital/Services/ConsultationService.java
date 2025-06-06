package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Consultation;

import java.util.List;

public interface ConsultationService {
    Consultation save(Consultation consultation);
    List<Consultation> getAll();
    Consultation getById(Long id);
    void delete(Long id);
}
