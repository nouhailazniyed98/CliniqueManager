package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.PharmacyDto;
import org.zzn.hospital.entitys.Pharmacy;

@Mapper(componentModel = "spring")
public interface PharmacyMapper {

    PharmacyDto toDto(Pharmacy pharmacy);
    Pharmacy fromDto(PharmacyDto dto);
}
