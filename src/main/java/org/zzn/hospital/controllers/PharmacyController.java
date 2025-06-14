package org.zzn.hospital.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.PharmacyDto;
import org.zzn.hospital.entitys.Pharmacy;
import org.zzn.hospital.services.PharmacyService;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacies")
@RequiredArgsConstructor
public class PharmacyController {
    private final PharmacyService service;

    @PostMapping
    public PharmacyDto create(@RequestBody PharmacyDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public PharmacyDto update(@PathVariable int id, @RequestBody PharmacyDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public PharmacyDto delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/{id}")
    public PharmacyDto findById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping
    public List<PharmacyDto> findAll() {
        return service.findAll();
    }
}
