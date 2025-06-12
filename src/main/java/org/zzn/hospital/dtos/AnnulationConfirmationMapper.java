package org.zzn.hospital.dtos;

import org.mapstruct.Mapper;
import org.zzn.hospital.entitys.AnnulationConfirmation;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnnulationConfirmationMapper {

    AnnulationConfirmation fromCreateDto(CreateAnnulationConfirmationDto dto);

    AnnulationConfirmationDto toDto(AnnulationConfirmation entity);

    List<AnnulationConfirmationDto> toDtoList(List<AnnulationConfirmation> entities);
}
