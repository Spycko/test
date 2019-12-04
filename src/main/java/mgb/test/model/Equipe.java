package main.java.mgb.test.model;

import java.util.List;

public class Equipe {

    private String nom;
    private Entraineur entraineur;
    private List<Joueur> joueurList;

    public Equipe(String nom, Entraineur entraineur, List<Joueur> joueurList) {
        this.nom = nom;
        this.entraineur = entraineur;
        this.joueurList = joueurList;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEntraineur(Entraineur entraineur) {
        this.entraineur = entraineur;
    }

    public void setJoueurList(List<Joueur> joueurList) {
        this.joueurList = joueurList;
    }

    public String getNom() {
        return nom;
    }

    public Entraineur getEntraineur() {
        return entraineur;
    }

    public List<Joueur> getJoueurList() {
        return joueurList;
    }
}
