package org.zzn.hospital.services;

import org.zzn.hospital.dtos.DoctorDto;

public interface DoctorService extends CrudService<DoctorDto, Long> {
    DoctorDto create(DoctorDto doctorDto);

}
