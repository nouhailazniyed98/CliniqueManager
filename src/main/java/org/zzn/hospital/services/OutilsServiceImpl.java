package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.entitys.Outils;

import java.util.List;
@Service
public class OutilsServiceImpl implements OutilsService {
    @Override
    public Outils save(Outils outils) {
        return null;
    }

    @Override
    public List<Outils> getAll() {
        return List.of();
    }

    @Override
    public Outils getById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
