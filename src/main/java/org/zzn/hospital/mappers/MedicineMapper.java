package org.zzn.hospital.mappers;

import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.MedicineDto;
import org.zzn.hospital.entitys.Medicine;

@Mapper(componentModel = "spring")
public interface MedicineMapper {
    MedicineDto toDto(Medicine entity);
    Medicine fromDto(MedicineDto dto);
}
