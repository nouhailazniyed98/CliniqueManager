package org.zzn.hospital.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.dtos.DoctorDto;
import org.zzn.hospital.dtos.DoctorResponseDto;
import org.zzn.hospital.entitys.Doctor;
import org.zzn.hospital.services.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<DoctorResponseDto> createDoctor(@RequestBody DoctorDto doctorDto) {
        DoctorResponseDto created = doctorService.create(doctorDto);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorResponseDto> getById(@PathVariable Long id) {
        DoctorResponseDto doctor = doctorService.findById(id);
        return ResponseEntity.ok(doctor);
    }

    @GetMapping
    public ResponseEntity<List<DoctorResponseDto>> getAll() {
        return ResponseEntity.ok(doctorService.findAll());
    }
}
