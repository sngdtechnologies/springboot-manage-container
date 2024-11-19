package com.gestion.conteneur.service;

import com.gestion.conteneur.model.Conteneur;
import com.gestion.conteneur.repository.ConteneurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConteneurService {

    @Autowired
    private ConteneurRepository conteneurRepository;

    public boolean enregistrerConteneur(Conteneur conteneur) {
        if (!conteneurRepository.existsByNumeroAndSortieFalse(conteneur.getNumero())) {
            conteneurRepository.save(conteneur);
            return true;
        }
        return false;
    }

    public boolean enregistrerSortieConteneur(String numero, String immatriculation) {
        Optional<Conteneur> conteneurOpt = conteneurRepository.findByNumeroAndSortieFalse(numero);
        if (conteneurOpt.isPresent()) {
            Conteneur conteneur = conteneurOpt.get();
            conteneur.setSortie(true);
            conteneur.setImmatriculation(immatriculation);
            conteneurRepository.save(conteneur);
            return true;
        }
        return false;
    }

    public boolean estConteneurDansParc(String numero) {
        return conteneurRepository.existsByNumeroAndSortieFalse(numero);
    }
}