package org.zzn.hospital.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.OrdonnanceMedecineDto;
import org.zzn.hospital.entitys.OrdonnanceMedecine;
import org.zzn.hospital.services.OrdonnanceMedecineService;

import java.util.List;

@RestController
@RequestMapping("/api/ordonnances-medecines")
@RequiredArgsConstructor
public class OrdonnanceMedecineController {
    private OrdonnanceMedecineService service;


    @PostMapping
    public OrdonnanceMedecineDto create(@RequestBody OrdonnanceMedecineDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public OrdonnanceMedecineDto update(@PathVariable Long id, @RequestBody OrdonnanceMedecineDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public OrdonnanceMedecineDto delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @GetMapping("/{id}")
    public OrdonnanceMedecineDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<OrdonnanceMedecineDto> findAll() {
        return service.findAll();

    }
}
