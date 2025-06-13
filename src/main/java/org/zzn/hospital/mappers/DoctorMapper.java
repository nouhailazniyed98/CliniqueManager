package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.DoctorDto;
import org.zzn.hospital.dtos.DoctorResponseDto;
import org.zzn.hospital.entitys.Doctor;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    Doctor fromDto(DoctorDto doctorDto);
    DoctorResponseDto toDto(Doctor doctor);
}
