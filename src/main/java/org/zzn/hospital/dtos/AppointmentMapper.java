package org.zzn.hospital.dtos;

import org.zzn.hospital.entitys.Appointment;

import java.util.List;

public interface AppointmentMapper {
    Appointment fromCreateDto(CreateAppointmentDto dto);

    AppointmentDto toDto(Appointment appointment);

    List<AppointmentDto> toDtoList(List<Appointment> appointments);
}
