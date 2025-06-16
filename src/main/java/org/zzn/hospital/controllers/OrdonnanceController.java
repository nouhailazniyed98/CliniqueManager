package org.zzn.hospital.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.OrdonnanceDTO;
import org.zzn.hospital.services.OrdonnanceService;
import java.util.List;

@RestController
@RequestMapping("/api/ordonnances")
@RequiredArgsConstructor
public class OrdonnanceController {
    private final OrdonnanceService ordonnanceService;

    @PostMapping
    public ResponseEntity<OrdonnanceDTO> create(@RequestBody OrdonnanceDTO dto) {
        return ResponseEntity.ok(ordonnanceService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdonnanceDTO> update(@PathVariable Long id, @RequestBody OrdonnanceDTO dto) {
        return ResponseEntity.ok(ordonnanceService.update(id, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdonnanceDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(ordonnanceService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrdonnanceDTO> delete(@PathVariable Long id) {
        return ResponseEntity.ok(ordonnanceService.delete(id));
    }

    @GetMapping
    public ResponseEntity<List<OrdonnanceDTO>> findAll() {
        return ResponseEntity.ok(ordonnanceService.findAll());
    }
}
