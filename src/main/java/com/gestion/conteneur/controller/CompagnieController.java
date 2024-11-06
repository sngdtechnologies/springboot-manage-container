package com.gestion.conteneur.controller;

import com.gestion.conteneur.model.Compagnie;
import com.gestion.conteneur.service.CompagnieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compagnies")
public class CompagnieController {

    @Autowired
    private CompagnieService compagnieMaritimeService;

    @GetMapping
    public List<Compagnie> getAll() {
        return compagnieMaritimeService.findAll();
    }

    @PostMapping
    public Compagnie create(@RequestBody Compagnie compagnieMaritime) {
        return compagnieMaritimeService.save(compagnieMaritime);
    }
}
