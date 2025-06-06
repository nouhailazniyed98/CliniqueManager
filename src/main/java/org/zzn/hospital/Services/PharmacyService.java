package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Pharmacy;

import java.util.List;

public interface PharmacyService {
    Pharmacy save(Pharmacy pharmacy);
    List<Pharmacy> getAll();
    Pharmacy getById(int id);
    void delete(int id);
}
