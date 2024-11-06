package com.gestion.conteneur.service;

import com.gestion.conteneur.model.Compagnie;
import com.gestion.conteneur.repository.CompagnieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompagnieService {

    @Autowired
    private CompagnieRepository compagnieMaritimeRepository;

    public List<Compagnie> findAll() {
        return compagnieMaritimeRepository.findAll();
    }

    public Compagnie save(Compagnie compagnieMaritime) {
        return compagnieMaritimeRepository.save(compagnieMaritime);
    }
}