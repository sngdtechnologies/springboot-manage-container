package com.gestion.conteneur.model;

import com.gestion.conteneur.model.Conteneur;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "compagnie")
public class Compagnie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "client" }, allowSetters = true)
    @JdbcTypeCode(SqlTypes.JSON)
    private Set<Conteneur> conteneurs = new HashSet<>();

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public Set<Conteneur> getConteneurs() {
        return this.conteneurs;
    }
    public void setConteneurs(Set<Conteneur> conteneurs) {
        this.conteneurs = conteneurs;
    }
}
