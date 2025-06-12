package org.zzn.hospital.dtos;

import org.mapstruct.Mapper;
import org.zzn.hospital.entitys.Personnel;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonnelMapper {
    Personnel fromCreateDto(CreatePersonnelDto dto);

    PersonnelDto toDto(Personnel personnel);

    List<PersonnelDto> toDtoList(List<Personnel> personnels);
}
