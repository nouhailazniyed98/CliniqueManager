package org.zzn.hospital.services;

import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.dtos.PersonnelResponseDto;
import org.zzn.hospital.entitys.Personnel;

import java.util.List;

public interface PersonnelService extends CrudService<PersonnelResponseDto, Long> {
    PersonnelResponseDto create(PersonnelDto personnelDto);
}
