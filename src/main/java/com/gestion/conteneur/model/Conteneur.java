package com.gestion.conteneur.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
@Table(name = "conteneur")
public class Conteneur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String numero;
    private String type;
    private String etat;
    private Long compagnieId;
    private Long clientId;
    private Boolean sortie = false;
    private String immatriculation;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }

    public Long getCompagnieId() { return compagnieId; }
    public void setCompagnieId(Long compagnieId) { this.compagnieId = compagnieId; }

    public Long getClientId() { return clientId; }
    public void setClientId(Long clientId) { this.clientId = clientId; }

    public Boolean isSortie() { return sortie; }
    public void setSortie(Boolean sortie) { this.sortie = sortie; }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }
}
