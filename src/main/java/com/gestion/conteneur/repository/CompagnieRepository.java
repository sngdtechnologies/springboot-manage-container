package com.gestion.conteneur.repository;

import com.gestion.conteneur.model.Compagnie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompagnieRepository extends JpaRepository<Compagnie, Long> {
    
}
