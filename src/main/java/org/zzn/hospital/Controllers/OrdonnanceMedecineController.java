package org.zzn.hospital.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.Models.OrdonnanceMedecine;
import org.zzn.hospital.Services.OrdonnanceMedecineService;

import java.util.List;

@RestController
@RequestMapping("/ordonnances-medecines")
public class OrdonnanceMedecineController {
    @Autowired
    private OrdonnanceMedecineService ordonnanceMedecineService;

    @GetMapping
    public List<OrdonnanceMedecine> getAll() {
        return ordonnanceMedecineService.getAll();
    }

    @GetMapping("/{id}")
    public OrdonnanceMedecine getById(@PathVariable Long id) {
        return ordonnanceMedecineService.getById(id);
    }

    @PostMapping
    public OrdonnanceMedecine create(@RequestBody OrdonnanceMedecine ordonnanceMedecine) {
        return ordonnanceMedecineService.save(ordonnanceMedecine);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ordonnanceMedecineService.delete(id);
    }
}
