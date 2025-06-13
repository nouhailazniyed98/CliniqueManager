package org.zzn.hospital.services;

import org.zzn.hospital.dtos.DoctorDto;
import org.zzn.hospital.dtos.DoctorResponseDto;
import org.zzn.hospital.entitys.Doctor;

import java.util.List;

public interface DoctorService extends CrudService<DoctorResponseDto, Long> {
    DoctorResponseDto create(DoctorDto doctorDto);

}
