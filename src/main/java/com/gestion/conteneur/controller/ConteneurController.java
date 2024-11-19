package com.gestion.conteneur.controller;

import com.gestion.conteneur.model.Conteneur;
import com.gestion.conteneur.service.ConteneurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/conteneurs")
public class ConteneurController {

    @Autowired
    private ConteneurService conteneurService;

    @PostMapping
    public String enregistrerConteneur(@RequestBody Conteneur conteneur) {
        if (conteneurService.enregistrerConteneur(conteneur)) {
            return "Conteneur enregistré avec succès.";
        }
        return "Erreur lors de l'enregistrement du conteneur.";
    }

    @PostMapping("/sortie")
    public String enregistrerSortieConteneur(@RequestParam String numero, @RequestParam String immatriculation) {
        if (conteneurService.enregistrerSortieConteneur(numero, immatriculation)) {
            return "Sortie du conteneur enregistrée avec succès.";
        }
        return "Erreur lors de l'enregistrement de la sortie.";
    }

    @GetMapping("/presence")
    public String estConteneurDansParc(@RequestParam String numero) {
        boolean estDansParc = conteneurService.estConteneurDansParc(numero);
        return estDansParc ? "Le conteneur est dans le parc." : "Le conteneur n'est pas dans le parc.";
    }
}
