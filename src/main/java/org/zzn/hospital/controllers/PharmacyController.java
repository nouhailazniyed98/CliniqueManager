package org.zzn.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.Pharmacy;
import org.zzn.hospital.services.PharmacyService;

import java.util.List;

@RestController
@RequestMapping("/pharmacies")
public class PharmacyController {
    @Autowired
    private PharmacyService pharmacyService;

    @GetMapping
    public List<Pharmacy> getAll() {
        return pharmacyService.getAll();
    }

    @GetMapping("/{id}")
    public Pharmacy getById(@PathVariable int id) {
        return pharmacyService.getById(id);
    }

    @PostMapping
    public Pharmacy create(@RequestBody Pharmacy pharmacy) {
        return pharmacyService.save(pharmacy);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        pharmacyService.delete(id);
    }
}
