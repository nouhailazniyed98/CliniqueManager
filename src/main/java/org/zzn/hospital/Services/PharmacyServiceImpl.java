package org.zzn.hospital.Services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.Models.Pharmacy;

import java.util.List;
@Service
public class PharmacyServiceImpl implements PharmacyService {
    @Override
    public Pharmacy save(Pharmacy pharmacy) {
        return null;
    }

    @Override
    public List<Pharmacy> getAll() {
        return List.of();
    }

    @Override
    public Pharmacy getById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
