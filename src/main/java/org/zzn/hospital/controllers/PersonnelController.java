package org.zzn.hospital.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.services.PersonnelService;

import java.util.List;

@RestController
@RequestMapping("/api/personnels")
public class PersonnelController {
    private final PersonnelService personnelService;

    public PersonnelController(PersonnelService personnelService) {
        this.personnelService = personnelService;
    }


    @PostMapping
    public ResponseEntity<PersonnelDto> createPersonnel(@RequestBody PersonnelDto personnelDto) {
        PersonnelDto created = personnelService.create(personnelDto);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonnelDto> getById(@PathVariable Long id) {
        PersonnelDto personnel = personnelService.findById(id);
        return ResponseEntity.ok(personnel);
    }

    @GetMapping
    public ResponseEntity<List<PersonnelDto>> getAll() {
        return ResponseEntity.ok(personnelService.findAll());
    }
}
