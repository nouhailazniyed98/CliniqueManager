package org.zzn.hospital.Services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.Models.Medecine;

import java.util.List;
@Service
public class MedecineServiceImpl implements MedecineService {
    @Override
    public Medecine save(Medecine medecine) {
        return null;
    }

    @Override
    public Medecine getById(Long id) {
        return null;
    }

    @Override
    public List<Medecine> getAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
