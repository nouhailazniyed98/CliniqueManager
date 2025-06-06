package org.zzn.hospital.Services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.Models.Consultation;

import java.util.List;
@Service
public class ConsultationServiceImpl implements  ConsultationService {

    @Override
    public Consultation save(Consultation consultation) {
        return null;
    }

    @Override
    public List<Consultation> getAll() {
        return List.of();
    }

    @Override
    public Consultation getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
