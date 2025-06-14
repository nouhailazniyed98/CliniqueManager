package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.OrdonnanceMedecineDto;
import org.zzn.hospital.entitys.OrdonnanceMedecine;

@Mapper(componentModel = "spring")
public interface OrdonnanceMedecineMapper {

    OrdonnanceMedecineDto toDto(OrdonnanceMedecine entity);
    OrdonnanceMedecine fromDto(OrdonnanceMedecineDto dto);
}
