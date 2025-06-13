package org.zzn.hospital.services;

import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.AppointmentDto;
import org.zzn.hospital.dtos.AppointmentResponseDto;
import org.zzn.hospital.entitys.Appointment;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.mappers.AppointmentMapper;
import org.zzn.hospital.repositories.AppointmentRepository;
import org.zzn.hospital.repositories.DoctorRepository;
import org.zzn.hospital.repositories.PatientRepository;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final AppointmentMapper appointmentMapper;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, PatientRepository patientRepository, DoctorRepository doctorRepository, AppointmentMapper appointmentMapper) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.appointmentMapper = appointmentMapper;
    }

    @Override
    public AppointmentResponseDto create(AppointmentDto appointmentDto) {
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
    public AppointmentResponseDto create(Patient object) {
        return null;
    }

    @Override
    public AppointmentResponseDto update(AppointmentResponseDto object) {
        return null;
    }

    @Override
    public AppointmentResponseDto update(Long aLong, AppointmentResponseDto dto) {
        return null;
    }

    @Override
    public AppointmentResponseDto delete(Long aLong) {
        return null;
    }

    @Override
    public AppointmentResponseDto findById(Long aLong) {
        return null;
    }

    @Override
    public List<AppointmentResponseDto> findAll() {
        return List.of();
    }
}
