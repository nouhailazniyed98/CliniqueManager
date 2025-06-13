package org.zzn.hospital.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.PersonnelDto;
import org.zzn.hospital.dtos.PersonnelResponseDto;
import org.zzn.hospital.entitys.Personnel;
import org.zzn.hospital.services.PatientService;
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
    public ResponseEntity<PersonnelResponseDto> createPersonnel(@RequestBody PersonnelDto personnelDto) {
        PersonnelResponseDto created = personnelService.create(personnelDto);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonnelResponseDto> getById(@PathVariable Long id) {
        PersonnelResponseDto personnel = personnelService.findById(id);
        return ResponseEntity.ok(personnel);
    }

    @GetMapping
    public ResponseEntity<List<PersonnelResponseDto>> getAll() {
        return ResponseEntity.ok(personnelService.findAll());
    }
}
