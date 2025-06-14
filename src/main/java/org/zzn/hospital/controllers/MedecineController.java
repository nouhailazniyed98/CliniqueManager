package org.zzn.hospital.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.MedecineDto;
import org.zzn.hospital.entitys.Medecine;
import org.zzn.hospital.services.MedecineService;

import java.util.List;

@RestController
@RequestMapping("/api/medecines")
@RequiredArgsConstructor
public class MedecineController {
    private final MedecineService service;

    @PostMapping
    public MedecineDto create(@RequestBody MedecineDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public MedecineDto update(@PathVariable Long id, @RequestBody MedecineDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public MedecineDto delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @GetMapping("/{id}")
    public MedecineDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<MedecineDto> findAll() {
        return service.findAll();
    }

}
