package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.dtos.PersonnelResponseDto;
import org.zzn.hospital.entitys.Personnel;


@Mapper(componentModel = "spring")
public interface PersonnelMapper {
    Personnel fromDto(PersonnelDto dto);

    PersonnelResponseDto toDto(Personnel personnel);
}
