package org.zzn.hospital.services;

import org.zzn.hospital.dtos.AppointmentDto;
import org.zzn.hospital.dtos.AppointmentResponseDto;

public interface AppointmentService extends CrudService<AppointmentResponseDto, Long> {
    AppointmentResponseDto create(AppointmentDto appointmentDto);

}
