package org.zzn.hospital.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zzn.hospital.Models.Appointment;
import org.zzn.hospital.Repositories.AppointmentRepository;

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
