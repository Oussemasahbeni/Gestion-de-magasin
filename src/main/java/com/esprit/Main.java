package com.esprit;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produit> produits;
        int magainsNombreTotal = 0;
        Produit produit1 = new Produit(1021, "Lait", "Delice",1.500,new Date("2022/12/12"));
        Produit produit2 = new Produit(2510,"Yaourt","Vitalait",1.500,new Date("2022/12/12"));
        Produit produit3 = new Produit(3250,"Tomate,","Sicam", 1.200,new Date("2022/12/12"));
        Produit produi5 = new Produit(3250,"Tomate,","Sicam", 1.200,new Date("2022/12/12"));
        produits = List.of(produit1,produit2,produit3);
        produit1.setPrix(1.500);
        produit2.setPrix(0.500);
        Magasin magasin = new Magasin();
        Magasin magasin2 = new Magasin();
        magasin.setId("M1");
        magasin.setAddress("Tunis");
        magasin2.setId("M2");
        magasin2.setAddress("Sousse");

        magasin.addProduit(produit1);
        magasin.addProduit(produit2);
        magasin.addProduit(produit3);
        magasin.addProduit(produi5);
        System.out.println(magasin);

        magasin2.addProduit(produit1);
        magasin2.addProduit(produit2);
        magasin2.addProduit(produit3);

        // afficher les libelle des produits
        produits.forEach(produit -> {
           System.out.println("libelle:  "+produit.getLibelle());
        });

        // affichage avec toString
        produits.forEach(produit -> {
            System.out.println(produit.toString());
        });

        // afficher le nombre total de produits dans tous les magasins
        System.out.println("Nombre total de produits dans les  magasins: " + Produit.nbProduits);


        Magasin magasinAvecPlusDeProduits = Magasin.getMagasinAvecPlusDeProduits(magasin, magasin2);
        System.out.println("Le magasin avec le plus de produits est : " + magasinAvecPlusDeProduits.getId());


    }
}