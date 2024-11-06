package com.gestion.conteneur.controller;

import com.gestion.conteneur.controller.vm.ConteneurVM;
import com.gestion.conteneur.controller.vm.ConteneurVVM;
import com.gestion.conteneur.model.Conteneur;
import com.gestion.conteneur.service.ConteneurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conteneurs")
public class ConteneurController {

    @Autowired
    private ConteneurService conteneurService;

    @GetMapping
    public List<Conteneur> getAll() {
        return conteneurService.findAll();
    }

    @PostMapping
    public Conteneur create(@RequestBody ConteneurVVM conteneur) {
        return conteneurService.save(conteneur);
    }

    @PutMapping("/sortie/{numero}")
    public Conteneur sortie(@PathVariable String numero, @RequestBody ConteneurVM conteneurVM) {
        return conteneurService.sortie(numero, conteneurVM);
    }

    @GetMapping("/{numero}")
    public Conteneur estConteneurDansParc(@PathVariable String numero) {
        return conteneurService.estConteneurDansParc(numero);
    }
}
