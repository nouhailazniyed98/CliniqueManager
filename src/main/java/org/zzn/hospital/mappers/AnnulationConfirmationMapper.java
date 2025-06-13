package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.AnnulationConfirmationDto;
import org.zzn.hospital.entitys.AnnulationConfirmation;

@Mapper(componentModel = "spring")
public interface AnnulationConfirmationMapper {
    AnnulationConfirmation toEntity(AnnulationConfirmationDto dto);

    AnnulationConfirmationDto toDto(AnnulationConfirmation entity);
}
