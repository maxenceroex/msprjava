package com.company;

import java.util.List;
import java.util.Objects;

public class Agent {

    private String nom;
    private String prenom;
    private List<String> objet;

    //Contructeur = même nom que la classe
    //Instancie l'objet (ici Agent)

    public Agent(String nom, String prenom, List<String> objet) {
        this.nom = nom;
        this.prenom = prenom;
        this.objet = objet;
    }
    // lecture de l'attribut nom
    public String getNom() {
        return nom;
    }
    // méthode de récupération de l'attribut nom de notre objet
    //ecriture de l'attribut
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
