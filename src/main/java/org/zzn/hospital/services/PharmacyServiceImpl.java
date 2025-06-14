package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.PharmacyDto;
import org.zzn.hospital.entitys.Pharmacy;
import org.zzn.hospital.mappers.PharmacyMapper;
import org.zzn.hospital.repositories.PharmacyRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class PharmacyServiceImpl implements PharmacyService {
    private final PharmacyRepository repository;
    private final PharmacyMapper mapper;

    @Override
    public PharmacyDto create(PharmacyDto dto) {
        return mapper.toDto(repository.save(mapper.fromDto(dto)));
    }

    @Override
    public PharmacyDto update(PharmacyDto dto) {
        return update(dto.getIdPharmacy(), dto);
    }

    @Override
    public PharmacyDto update(Integer id, PharmacyDto dto) {
        Pharmacy entity = repository.findById(id).orElseThrow();
        entity.setNamePharmacy(dto.getNamePharmacy());
        entity.setPhoneNumber(dto.getPhonePharmacy());
        entity.setEmailPharmacy(dto.getEmailPharmacy());
        return mapper.toDto(repository.save(entity));    }

    @Override
    public PharmacyDto delete(Integer id) {
        Pharmacy entity = repository.findById(id).orElseThrow();
        repository.delete(entity);
        return mapper.toDto(entity);    }

    @Override
    public PharmacyDto findById(Integer id) {
        return repository.findById(id).map(mapper::toDto).orElseThrow();
    }

    @Override
    public List<PharmacyDto> findAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}
