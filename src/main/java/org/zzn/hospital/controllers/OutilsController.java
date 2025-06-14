package org.zzn.hospital.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.OutilsDto;
import org.zzn.hospital.entitys.Outils;
import org.zzn.hospital.services.OutilsService;

import java.util.List;

@RestController
@RequestMapping("/api/outils")
@RequiredArgsConstructor
public class OutilsController {
    private final OutilsService service;
    @PostMapping
    public OutilsDto create(@RequestBody OutilsDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public OutilsDto update(@PathVariable int id, @RequestBody OutilsDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public OutilsDto delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/{id}")
    public OutilsDto findById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping
    public List<OutilsDto> findAll() {
        return service.findAll();
    }
}
