package com.esprit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int magainsNombreTotal = 0;
        Produit produit1 = new Produit(1021, "Lait", "Delice",1.500,new Date("2022/12/12"));
        Produit produit2 = new Produit(2510,"Yaourt","Vitalait",1.500,new Date("2022/12/12"));
        Produit produit3 = new Produit(3250,"Tomate,","Sicam", 1.200,new Date("2022/12/12"));
        produit1.setPrix(1.500);
        produit2.setPrix(0.500);
        Magasin magasin = new Magasin();
        Magasin magasin2 = new Magasin();
        magasin.setId("M1");
        magasin.setAddress("Tunis");
        magasin.setCapacity(50);
        magasin2.setId("M2");
        magasin2.setAddress("Sousse");
        magasin2.setCapacity(50);

        magasin.addProduit(produit1);
        magasin.addProduit(produit2);
        magasin.addProduit(produit3);
        System.out.println(magasin);

        magasin2.addProduit(produit1);
        magasin2.addProduit(produit2);
        magasin2.addProduit(produit3);

        magainsNombreTotal = magasin2.getProduits().length + magasin.getProduits().length;
        System.out.println("Nombre total de produits dans les deux magasins: " + magainsNombreTotal);

    }
}