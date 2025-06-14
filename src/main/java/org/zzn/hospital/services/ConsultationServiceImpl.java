package org.zzn.hospital.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzn.hospital.dtos.ConsultationDto;
import org.zzn.hospital.exceptions.ConsultationAlreadyExistsException;
import org.zzn.hospital.exceptions.ConsultationNotFoundException;
import org.zzn.hospital.entitys.Consultation;
import org.zzn.hospital.mappers.ConsultationMapper;
import org.zzn.hospital.repositories.ConsultationRepository;
import org.zzn.hospital.entitys.Consultation;

import java.util.List;
@Service
@AllArgsConstructor

public class ConsultationServiceImpl implements  ConsultationService {

    private final ConsultationRepository consultationRepository;
    private final ConsultationMapper consultationMapper;

    @Override
    public ConsultationDto create(ConsultationDto dto) {
        Consultation consultation = consultationMapper.fromDto(dto);
        Consultation saved = consultationRepository.save(consultation);
        return consultationMapper.toDto(saved);
    }

    @Override
    public ConsultationDto update(Long id,ConsultationDto dto) {
        Consultation consultation = consultationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consultation not found"));
        consultation.setDiagnostic(dto.getDiagnostic());
        consultation.setRemarque(dto.getRemarque());
        Consultation updated = consultationRepository.save(consultation);
        return consultationMapper.toDto(updated);
    }

    @Override
    public ConsultationDto update( ConsultationDto dto) {
        return update(dto.getIdConsultation(),dto);
    }

    @Override
    public ConsultationDto delete(Long id) {
        Consultation consultation = consultationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consultation not found"));
        consultationRepository.delete(consultation);
        return consultationMapper.toDto(consultation);
    }

    @Override
    public ConsultationDto findById(Long id) {
        return consultationRepository.findById(id)
                .map(consultationMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Consultation not found"));
    }

    @Override
    public List<ConsultationDto> findAll() {
        return consultationRepository.findAll()
                .stream()
                .map(consultationMapper::toDto)
                .toList();
    }
}

