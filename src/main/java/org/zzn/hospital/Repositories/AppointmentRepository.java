package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zzn.hospital.Models.Appointment;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
