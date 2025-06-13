package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.zzn.hospital.dtos.AppointmentDto;
import org.zzn.hospital.entitys.Appointment;

@Mapper(componentModel = "spring", uses = AnnulationConfirmationMapper.class)
public interface AppointmentMapper {
    @Mapping(target = "patient.id", source = "patientId")
    @Mapping(target = "doctor.id", source = "doctorId")
    Appointment toEntity(AppointmentDto dto);

    @Mapping(target = "patientName", expression = "java(appointment.getPatient().getFirstName() + \" \" + appointment.getPatient().getLastName())")
    @Mapping(target = "doctorName", expression = "java(appointment.getDoctor().getFirstName() + \" \" + appointment.getDoctor().getLastName())")
    AppointmentDto toDto(Appointment appointment);
}
