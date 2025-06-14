package org.zzn.hospital.mappers;

import org.zzn.hospital.dtos.MedecineDto;
import org.zzn.hospital.entitys.Medecine;

public interface MedecineMapper {
    MedecineDto toDto(Medecine medecine);
    Medecine fromDto(MedecineDto medecineDto);
}
