package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.zzn.hospital.dtos.OrdonnanceDto;
import org.zzn.hospital.entitys.Ordonnance;

@Mapper(componentModel = "spring")
public interface OrdonnanceMapper {
    @Mapping(source = "medecine.idMedecine", target = "medecineId")
    OrdonnanceDto toDto(Ordonnance ordonnance);

    @Mapping(source = "medecineId", target="medecine.idMedecine")
    Ordonnance fromDto(OrdonnanceDto dto);
}