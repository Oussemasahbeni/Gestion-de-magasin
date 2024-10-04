package com.esprit;

import java.util.Date;

public class Produit {

     private Integer id;
     private String libelle;
     private String marque;
     private Double prix;
     private Date dateExpiration;

     public static Integer nbProduits = 0;

    public Produit(Integer id, String libelle, String marque, Double prix, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
        nbProduits++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        if(prix < 0){
            throw new IllegalArgumentException("Prix doit etre positif");
        }
        this.prix = prix;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }


    public boolean compare(Produit produit){
        return this.id.equals(produit.id) && this.libelle.equals(produit.libelle) && this.prix.equals(produit.prix);
    }

    public boolean compare(Produit produit1, Produit produit2){
        return produit1.id.equals(produit2.id) && produit1.libelle.equals(produit2.libelle) && produit1.prix.equals(produit2.prix);
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
