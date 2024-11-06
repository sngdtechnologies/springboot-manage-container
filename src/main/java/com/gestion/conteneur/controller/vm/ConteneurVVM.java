package com.gestion.conteneur.controller.vm;

import com.gestion.conteneur.model.enumeration.TypeConteneur;
import com.gestion.conteneur.model.enumeration.EtatConteneur;

public class ConteneurVVM {
    private String numero;
    private TypeConteneur type;
    private EtatConteneur etat;
    private Long compagieId;
    private Long clientId;

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public TypeConteneur getType() { return type; }
    public void setType(TypeConteneur type) { this.type = type; }

    public EtatConteneur getEtat() { return etat; }
    public void setEtat(EtatConteneur etat) { this.etat = etat; }

    public Long getCompagieId() { return compagieId; }
    public void setCompagieId(Long compagieId) { this.compagieId = compagieId; }

    public Long getClientId() { return clientId; }
    public void setClientId(Long clientId) { this.clientId = clientId; }
}