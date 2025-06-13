package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.AppointmentDto;
import org.zzn.hospital.entitys.Appointment;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.mappers.AppointmentMapper;
import org.zzn.hospital.repositories.AppointmentRepository;
import org.zzn.hospital.repositories.DoctorRepository;
import org.zzn.hospital.repositories.PatientRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final AppointmentMapper appointmentMapper;


    @Override
    public AppointmentDto create(AppointmentDto appointmentDto) {
        Patient patient = patientRepository.findById(appointmentDto.getPatientId())
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        Doctor doctor = doctorRepository.findById(appointmentDto.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        Appointment appointment = appointmentMapper.toEntity(appointmentDto);
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        return appointmentMapper.toDto(appointmentRepository.save(appointment));
    }

    @Override
    public AppointmentDto create(Patient object) {
        return null;
    }

    @Override
    public AppointmentDto update(AppointmentDto object) {
        return null;
    }

    @Override
    public AppointmentDto update(Long aLong, AppointmentDto dto) {
        return null;
    }

    @Override
    public AppointmentDto delete(Long aLong) {
        return null;
    }

    @Override
    public AppointmentDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<AppointmentDto> findAll() {
        return List.of();
    }
}
