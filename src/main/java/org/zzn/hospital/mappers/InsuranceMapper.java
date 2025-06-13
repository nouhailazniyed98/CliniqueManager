package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.InsuranceDto;
import org.zzn.hospital.entitys.Insurance;

@Mapper(componentModel = "spring")
public interface InsuranceMapper {
    Insurance toEntity(InsuranceDto dto);
    InsuranceDto toDto(Insurance insurance);
}
