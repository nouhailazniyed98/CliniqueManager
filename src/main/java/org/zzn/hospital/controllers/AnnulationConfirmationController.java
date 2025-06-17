package org.zzn.hospital.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.AnnulationConfirmationDto;
import org.zzn.hospital.services.AnnulationConfirmationService;

import java.util.List;

@RestController
@RequestMapping("/api/annulation-confirmations")
@RequiredArgsConstructor
public class AnnulationConfirmationController {

    private final AnnulationConfirmationService annulationConfirmationService;

    @PostMapping
    public ResponseEntity<AnnulationConfirmationDto> create(@RequestBody AnnulationConfirmationDto dto) {
        AnnulationConfirmationDto created = annulationConfirmationService.create(dto);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnulationConfirmationDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(annulationConfirmationService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<AnnulationConfirmationDto>> getAll() {
        return ResponseEntity.ok(annulationConfirmationService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        annulationConfirmationService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnnulationConfirmationDto> updateAnnulationConfirmation(
            @PathVariable Long id,
            @RequestBody AnnulationConfirmationDto dto) {
        AnnulationConfirmationDto updated = annulationConfirmationService.update(id, dto);
        return ResponseEntity.ok(updated);
    }

}
