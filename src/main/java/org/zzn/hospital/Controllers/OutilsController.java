package org.zzn.hospital.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zzn.hospital.Models.Outils;
import org.zzn.hospital.Services.OutilsService;

import java.util.List;

@RestController
@RequestMapping("/outils")
public class OutilsController {

    @Autowired
    private OutilsService outilsService;

    @GetMapping
    public List<Outils> getAll() {
        return outilsService.getAll();
    }

    @GetMapping("/{id}")
    public Outils getById(@PathVariable int id) {
        return outilsService.getById(id);
    }

    @PostMapping
    public Outils create(@RequestBody Outils outils) {
        return outilsService.save(outils);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        outilsService.delete(id);
    }
}
