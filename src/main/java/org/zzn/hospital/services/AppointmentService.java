package org.zzn.hospital.services;

import org.zzn.hospital.dtos.AppointmentDto;

public interface AppointmentService extends CrudService<AppointmentDto, Long> {
    AppointmentDto create(AppointmentDto appointmentDto);

}
