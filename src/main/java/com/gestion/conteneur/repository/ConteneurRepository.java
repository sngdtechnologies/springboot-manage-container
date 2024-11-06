package com.gestion.conteneur.repository;

import com.gestion.conteneur.model.Conteneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConteneurRepository extends JpaRepository<Conteneur, Long> {
    
    Optional<Conteneur> findOneByNumero(String numero);
    Optional<Conteneur> findOneByNumeroAndSortieIsFalse(String numero);
}
