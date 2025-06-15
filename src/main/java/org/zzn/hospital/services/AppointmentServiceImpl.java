package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.AppointmentDto;
import org.zzn.hospital.entitys.AnnulationConfirmation;
import org.zzn.hospital.entitys.Appointment;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.entitys.Patient;
import org.zzn.hospital.exceptions.AppointmentNotFoundException;
import org.zzn.hospital.exceptions.DoctorNotFoundException;
import org.zzn.hospital.exceptions.PatientNotFoundException;
import org.zzn.hospital.mappers.AppointmentMapper;
import org.zzn.hospital.repositories.AppointmentRepository;
import org.zzn.hospital.repositories.DoctorRepository;
import org.zzn.hospital.repositories.PatientRepository;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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
    public AppointmentDto update(AppointmentDto dto) {
        if (dto.getId() == null) {
            throw new IllegalArgumentException("Appointment ID must not be null.");
        }
        return update(dto.getId(), dto);
    }

    @Override
    public AppointmentDto update(Long id, AppointmentDto dto) {
        Appointment existing = appointmentRepository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new AppointmentNotFoundException(id));

        Patient patient = patientRepository.findById(dto.getPatientId())
                .orElseThrow(() -> new PatientNotFoundException(dto.getPatientId()));
        Doctor doctor = doctorRepository.findById(dto.getDoctorId())
                .orElseThrow(() -> new DoctorNotFoundException(dto.getDoctorId()));

        existing.setAnnulationConfirmation(AnnulationConfirmation.builder().build());
        existing.setDay(dto.getDay());
        existing.setHour(dto.getHour());
        existing.setPatient(patient);
        existing.setDoctor(doctor);

        Appointment saved = appointmentRepository.save(existing);
        return appointmentMapper.toDto(saved);
    }

    @Override
    public AppointmentDto delete(Long id) {
        Appointment existing = appointmentRepository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new AppointmentNotFoundException(id));
        appointmentRepository.delete(existing);
        return appointmentMapper.toDto(existing);
    }

    @Override
    public AppointmentDto findById(Long id) {
        Appointment appointment = appointmentRepository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new AppointmentNotFoundException(id));
        return appointmentMapper.toDto(appointment);
    }

    @Override
    public List<AppointmentDto> findAll() {
        return appointmentRepository.findAll()
                .stream()
                .map(appointmentMapper::toDto)
                .toList();
    }


}
