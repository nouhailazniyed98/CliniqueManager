package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Consultation;

import java.util.List;

public interface ConsultationService {
    Consultation save(Consultation consultation);
    List<Consultation> getAll();
    Consultation getById(Long id);
    void delete(Long id);
}
