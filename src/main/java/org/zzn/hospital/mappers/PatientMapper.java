package org.zzn.hospital.mappers;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.zzn.hospital.dtos.PatientDto;
import org.zzn.hospital.entitys.Patient;

@Mapper(componentModel = "spring", uses = InsuranceMapper.class)
public interface PatientMapper  {

    @Mapping(target = "id", source = "id")
    PatientDto toDto(Patient entity);

    @Mapping(target = "id", source = "id")
    Patient fromDto(PatientDto dto);
}


