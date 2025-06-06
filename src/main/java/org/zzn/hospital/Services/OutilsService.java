package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Outils;

import java.util.List;

public interface OutilsService {
    Outils save(Outils outils);
    List<Outils> getAll();
    Outils getById(int id);
    void delete(int id);
}
