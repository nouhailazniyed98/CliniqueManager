package org.zzn.hospital.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.Models.Ordonnance;
import org.zzn.hospital.Services.OrdonnanceService;

import java.util.List;

@RestController
@RequestMapping("/ordonnances")
public class OrdonnanceController {
    @Autowired
    private OrdonnanceService  ordonnanceService;

    @GetMapping
    public List<Ordonnance> getAllOrdonnance() {
        return ordonnanceService.getAllOrdonnance();
    }

    @GetMapping("/{id}")
    public Ordonnance getByIdOrdonnance(@PathVariable Long id) {
        return ordonnanceService.getByIdOrdonnance(id);
    }

    @PostMapping
    public Ordonnance createOrdonnance(@RequestBody Ordonnance om) {
        return ordonnanceService.addOrdonnance(om);
    }
    @PutMapping
    public void updateOrdonnance(@RequestBody Ordonnance om) {
        ordonnanceService.updateOrdonnance(om);
    }

    @DeleteMapping("/{id}")
    public void deleteOrdonnance(@PathVariable Long id) {
        ordonnanceService.deleteOrdonnance(id);
    }
}
