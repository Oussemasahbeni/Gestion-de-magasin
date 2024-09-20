package com.esprit;

import java.util.Date;

import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void afficher(Produit produit){
        out.println("Produit : "+produit.libelle+" "+produit.marque+" "+produit.prix+" "+produit.dateExpiration);
    }
    public static void main(String[] args) {
        // Question 1:
        Produit produit = new Produit();
    // Question 2:
        Produit produit1 = new Produit(1021, "Lait", "Delice");
        Produit produit2 = new Produit(2510,"Yaourt","Vitalait");
        Produit produit3 = new Produit(3250,"Tomate,","Sicam", 1.200);

    // Question 3:
        out.println("Question 3:");

        afficher(produit);
        afficher(produit1);
        afficher(produit2);
        afficher(produit3);

    // Question 4:
        out.println("Question 4:");

        produit1.prix = 1.500;
        afficher(produit1);

    // Question 5:
        out.println("Question 5:");

        produit2.prix = 0.500;
        afficher(produit2);

    // Question 6
        out.println("Question 6:");

        afficher(produit1);
        afficher(produit2);
        afficher(produit3);

        //Question 7
        out.println("Question 7:");

        out.println(produit1);
        out.println(produit2);
        out.println(produit3);

    // Question 8:
        out.println("Question 8:");
        produit1.dateExpiration =new Date("2022/12/12");
        produit2.dateExpiration =new Date("2022/12/12");
        produit3.dateExpiration =new Date("2022/12/12");
        afficher(produit1);
        afficher(produit2);
        afficher(produit3);

    }
}