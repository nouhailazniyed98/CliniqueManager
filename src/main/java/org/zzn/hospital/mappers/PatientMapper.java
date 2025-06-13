package org.zzn.hospital.mappers;
import org.mapstruct.Mapper;
import org.zzn.hospital.dtos.PatientDto;
import org.zzn.hospital.dtos.PatientResponseDto;
import org.zzn.hospital.entitys.Patient;

@Mapper(componentModel = "spring", uses = InsuranceMapper.class)
public interface PatientMapper  {

    Patient fromDto(PatientDto dto);
    PatientResponseDto toDto(Patient entity);

}

