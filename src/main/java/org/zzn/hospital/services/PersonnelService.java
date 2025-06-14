package org.zzn.hospital.services;

import org.zzn.hospital.dtos.PersonnelDto;

public interface PersonnelService extends CrudService<PersonnelDto, Long> {
    PersonnelDto create(PersonnelDto personnelDto);
}
