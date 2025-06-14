package org.zzn.hospital.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.OrdonnanceDto;
import org.zzn.hospital.entitys.Ordonnance;
import org.zzn.hospital.services.OrdonnanceService;
import java.util.List;

@RestController
@RequestMapping("/api/ordonnances")
@RequiredArgsConstructor
public class OrdonnanceController {
    private final OrdonnanceService ordonnanceService;

    @PostMapping
    public ResponseEntity<OrdonnanceDto> create(@RequestBody OrdonnanceDto dto) {
        return ResponseEntity.ok(ordonnanceService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdonnanceDto> update(@PathVariable Long id, @RequestBody OrdonnanceDto dto) {
        return ResponseEntity.ok(ordonnanceService.update(id, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdonnanceDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(ordonnanceService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrdonnanceDto> delete(@PathVariable Long id) {
        return ResponseEntity.ok(ordonnanceService.delete(id));
    }

    @GetMapping
    public ResponseEntity<List<OrdonnanceDto>> findAll() {
        return ResponseEntity.ok(ordonnanceService.findAll());
    }
}
