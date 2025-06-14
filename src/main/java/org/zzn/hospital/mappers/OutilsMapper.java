package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.OrdonnanceMedecineDto;
import org.zzn.hospital.dtos.OutilsDto;
import org.zzn.hospital.entitys.Outils;

@Mapper(componentModel = "spring")
public interface OutilsMapper {
    OutilsDto toDto(Outils outils);
    Outils fromDto(OutilsDto dto);
}
