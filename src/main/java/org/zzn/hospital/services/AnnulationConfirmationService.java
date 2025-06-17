package org.zzn.hospital.services;

import org.zzn.hospital.dtos.AnnulationConfirmationDto;

public interface AnnulationConfirmationService extends CrudService<AnnulationConfirmationDto, Long> {
    AnnulationConfirmationDto create(AnnulationConfirmationDto annulationConfirmationDto);
}
