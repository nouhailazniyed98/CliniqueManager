package org.zzn.hospital.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.entitys.Medecine;
import org.zzn.hospital.services.MedecineService;

import java.util.List;

@RestController
@RequestMapping("/medecines")
public class MedecineController {
    @Autowired
    private MedecineService medecineService;

    @GetMapping
    public List<Medecine> getAll() {
        return medecineService.getAll();
    }

    @GetMapping("/{id}")
    public Medecine getById(@PathVariable Long id) {
        return medecineService.getById(id);
    }

    @PostMapping
    public Medecine create(@RequestBody Medecine medecine) {
        return medecineService.save(medecine);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        medecineService.delete(id);
    }
}
