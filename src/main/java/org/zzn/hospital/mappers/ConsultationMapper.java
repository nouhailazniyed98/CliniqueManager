package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.entitys.Consultation;

@Mapper(componentModel = "spring")
public interface ConsultationMapper {
     ConsultationDTO toDto(Consultation consultation);
    Consultation fromDto(ConsultationDTO dto);

}
