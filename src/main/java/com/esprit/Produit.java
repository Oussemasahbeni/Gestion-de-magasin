package com.esprit;

import java.util.Date;

public class Produit {

     Integer id;
     String libelle;
     String marque;
     Double prix;
     Date dateExpiration;

    public Produit() {
    }

    public Produit(Integer id, String libelle, String marque, Double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit (Integer id, String libelle, String marque){
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
