package org.zzn.hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zzn.hospital.Enums.Days;
import org.zzn.hospital.entitys.Appointment;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.entitys.Patient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    List<Appointment> findByPatient(Patient patient); // Find a patient's appointments

    List<Appointment> findByDoctor(Doctor doctor);// Find a doctor's appointments

    boolean existsByDoctorAndDayAndHour(Doctor doctor, Days day, LocalTime hour);// Check if a slot is available for a doctor

    @Query(value = "SELECT * FROM appointment WHERE DATE(created_at) = :date", nativeQuery = true)
    List<Appointment> findByDate(@Param("date") LocalDate date);// Find appointments for a specific date
    // Version optimisée avec CAST

    // Alternative avec BETWEEN
    @Query("SELECT a FROM Appointment a WHERE a.createdAt BETWEEN :start AND :end")
    List<Appointment> findByDateRange(@Param("start") LocalDateTime start,
                                      @Param("end") LocalDateTime end);
}
