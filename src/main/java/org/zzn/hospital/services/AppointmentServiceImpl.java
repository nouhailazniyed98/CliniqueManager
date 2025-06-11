package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.entitys.Appointment;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {


    @Override
    public Appointment save(Appointment appointment) {
        return null;
    }

    @Override
    public List<Appointment> getAll() {
        return List.of();
    }

    @Override
    public Appointment getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
