package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.zzn.hospital.dtos.OrdonnanceDTO;
import org.zzn.hospital.dtos.OrdonnanceDTO;
import org.zzn.hospital.entitys.Ordonnance;

@Mapper(componentModel = "spring")
public interface OrdonnanceMapper {
    OrdonnanceDTO toDto(Ordonnance ordonnance);

    Ordonnance fromDto(OrdonnanceDTO dto);
}