package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.zzn.hospital.dtos.PharmacyDto;
import org.zzn.hospital.entitys.Pharmacy;

@Mapper(componentModel = "spring")
public interface PharmacyMapper {
    @Mapping(source = "phonePharmacy", target = "phonePharmacy")
    PharmacyDto toDto(Pharmacy pharmacy);

    @Mapping(source = "phonePharmacy", target = "phonePharmacy")

    Pharmacy fromDto(PharmacyDto dto);
}
