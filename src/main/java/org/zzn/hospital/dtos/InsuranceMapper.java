package org.zzn.hospital.dtos;

import org.mapstruct.Mapper;
import org.zzn.hospital.entitys.Insurance;

@Mapper(componentModel = "spring")
public interface InsuranceMapper {
    Insurance fromDto(InsuranceDto dto);

    InsuranceDto toDto(Insurance insurance);
}
