package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Pharmacy;

import java.util.List;

public interface PharmacyService {
    Pharmacy save(Pharmacy pharmacy);
    List<Pharmacy> getAll();
    Pharmacy getById(int id);
    void delete(int id);
}
