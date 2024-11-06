package com.gestion.conteneur.service;

import com.gestion.conteneur.controller.vm.ConteneurVM;
import com.gestion.conteneur.controller.vm.ConteneurVVM;
import com.gestion.conteneur.model.Client;
import com.gestion.conteneur.model.Compagnie;
import com.gestion.conteneur.model.Conteneur;
import com.gestion.conteneur.repository.ConteneurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ConteneurService {

    @Autowired
    private ConteneurRepository conteneurRepository;

    public List<Conteneur> findAll() {
        return conteneurRepository.findAll();
    }

    public Conteneur save(ConteneurVVM conteneurVM) {
        Conteneur conteneur = new Conteneur();
        conteneur.setType(conteneurVM.getType());
        conteneur.setEtat(conteneurVM.getEtat());
        
        Client client = new Client();
        client.setId(conteneurVM.getClientId());
        conteneur.setClient(client);
        
        Compagnie compagnie = new Compagnie();
        compagnie.setId(conteneurVM.getCompagieId());
        conteneur.setCompagnie(compagnie);
        
        if (conteneurVM.getNumero() == null) {
            conteneur.setNumero(UUID.randomUUID().toString());
        } else {
            conteneur.setNumero(conteneurVM.getNumero());
        }
        conteneur.setSortie(false);
        return conteneurRepository.save(conteneur);
    }

    public Conteneur sortie(String numero, ConteneurVM conteneurVM) {
        Conteneur conteneur = conteneurRepository.findOneByNumero(numero).orElseThrow();
        conteneur.setSortie(true);
        if (conteneurVM.getImmatriculation() != null) {
            conteneur.setImmatriculation(conteneurVM.getImmatriculation());
        }
        return conteneurRepository.save(conteneur);
    }

    public Conteneur estConteneurDansParc(String numero) {
        return conteneurRepository.findOneByNumeroAndSortieIsFalse(numero).orElseThrow();
    }
}