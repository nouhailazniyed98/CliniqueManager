package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Outils;

import java.util.List;

public interface OutilsService {
    Outils save(Outils outils);
    List<Outils> getAll();
    Outils getById(int id);
    void delete(int id);
}
