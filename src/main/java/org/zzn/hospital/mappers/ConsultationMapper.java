package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.ConsultationDto;
import org.zzn.hospital.entitys.Consultation;

@Mapper(componentModel = "spring")
public interface ConsultationMapper {
     ConsultationDto toDto(Consultation consultation);
    Consultation fromDto(ConsultationDto dto);

}
