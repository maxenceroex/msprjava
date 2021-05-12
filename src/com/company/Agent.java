package com.company;

import java.util.List;
import java.util.Objects;

public class Agent {

    private String nom;
    private String prenom;
    private List<String> objet;

    public Agent(String nom, String prenom, List<String> objet) {
        this.nom = nom;
        this.prenom = prenom;
        this.objet = objet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<String> getObjet() {
        return objet;
    }

    public void setObjet(List<String> objet) {
        this.objet = objet;
    }

}
