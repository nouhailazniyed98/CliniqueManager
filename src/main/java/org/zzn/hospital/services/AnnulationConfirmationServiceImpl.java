package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.AnnulationConfirmationDto;
import org.zzn.hospital.entitys.AnnulationConfirmation;
import org.zzn.hospital.mappers.AnnulationConfirmationMapper;
import org.zzn.hospital.repositories.AnnulationConfirmationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AnnulationConfirmationServiceImpl implements AnnulationConfirmationService{
    private final AnnulationConfirmationRepository repository;
    private final AnnulationConfirmationMapper mapper;

    @Override
    public AnnulationConfirmationDto create(AnnulationConfirmationDto annulationConfirmationDto) {
        AnnulationConfirmation entity = mapper.toEntity(annulationConfirmationDto);
        AnnulationConfirmation saved = repository.save(entity);
        return mapper.toDto(saved);
    }

    @Override
    public AnnulationConfirmationDto update(AnnulationConfirmationDto annulationConfirmationDto) {
        if (annulationConfirmationDto.getId() == null) {
            throw new IllegalArgumentException("ID must not be null for update");
        }
        return update(annulationConfirmationDto.getId(), annulationConfirmationDto);
    }

    @Override
    public AnnulationConfirmationDto update(Long id, AnnulationConfirmationDto dto) {
        AnnulationConfirmation existing = repository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("AnnulationConfirmation not found with id " + id));

        existing.setId(dto.getId());
        existing.setId(dto.getId());

        AnnulationConfirmation updated = repository.save(existing);
        return mapper.toDto(updated);
    }

    @Override
    public AnnulationConfirmationDto delete(Long id) {
        AnnulationConfirmation entity = repository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("AnnulationConfirmation not found with id " + id));
        repository.delete(entity);
        return mapper.toDto(entity);
    }

    @Override
    public AnnulationConfirmationDto findById(Long id) {
        AnnulationConfirmation entity = repository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("AnnulationConfirmation not found with id " + id));
        return mapper.toDto(entity);
    }

    @Override
    public List<AnnulationConfirmationDto> findAll() {
        List<AnnulationConfirmation> all = repository.findAll();
        return mapper.toDtoList(all);
    }
}
