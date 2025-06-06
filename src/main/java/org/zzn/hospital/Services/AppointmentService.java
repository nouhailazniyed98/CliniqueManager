package org.zzn.hospital.Services;

import org.zzn.hospital.Models.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment save(Appointment appointment);
    List<Appointment> getAll();
    Appointment getById(Long id);
    void delete(Long id);
}
