package org.zzn.hospital.dtos;

import org.mapstruct.Mapper;
import org.zzn.hospital.entitys.Doctor;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    Doctor fromCreateDto(CreateDoctorDto dto);

    DoctorDto toDto(Doctor doctor);

    List<DoctorDto> toDtoList(List<Doctor> doctors);
}
