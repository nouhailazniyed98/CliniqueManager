package org.zzn.hospital.services;

import org.zzn.hospital.entitys.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment save(Appointment appointment);
    List<Appointment> getAll();
    Appointment getById(Long id);
    void delete(Long id);
}
