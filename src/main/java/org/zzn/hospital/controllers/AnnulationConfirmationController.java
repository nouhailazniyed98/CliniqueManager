package org.zzn.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.AnnulationConfirmation;
import org.zzn.hospital.services.AnnulationConfirmationService;

import java.util.List;

@RestController
@RequestMapping("/annulations")
public class AnnulationConfirmationController {
    @Autowired
    private AnnulationConfirmationService service;

    @GetMapping
    public List<AnnulationConfirmation> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AnnulationConfirmation getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AnnulationConfirmation create(@RequestBody AnnulationConfirmation ac) {
        return service.save(ac);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
