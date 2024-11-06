package com.gestion.conteneur.model;

import com.gestion.conteneur.model.enumeration.TypeConteneur;
import com.gestion.conteneur.model.enumeration.EtatConteneur;
import com.gestion.conteneur.model.Client;
import com.gestion.conteneur.model.Compagnie;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
@Table(name = "conteneur")
public class Conteneur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private TypeConteneur type;
    private EtatConteneur etat;
    private String immatriculation;
    private Boolean sortie;
    private Timestamp date;

    @ManyToOne(optional = false)
    private Client client;

    @ManyToOne(optional = false)
    private Compagnie compagnie;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    
    public Compagnie getCompagnie() { return compagnie; }
    public void setCompagnie(Compagnie compagnie) { this.compagnie = compagnie; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public TypeConteneur getType() { return type; }
    public void setType(TypeConteneur type) { this.type = type; }

    public EtatConteneur getEtat() { return etat; }
    public void setEtat(EtatConteneur etat) { this.etat = etat; }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

    public Boolean getSortie() { return sortie; }
    public void setSortie(Boolean sortie) { this.sortie = sortie; }

    public Timestamp getDate() { return date; }
    public void setDate(Timestamp date) { this.date = date; }
}
