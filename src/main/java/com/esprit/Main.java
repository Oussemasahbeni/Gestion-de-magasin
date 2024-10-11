package com.esprit;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Produit> produits;
//        Produit produit1 = new Produit(1021, "Lait", "Delice",1.500,new Date("2022/12/12"));
//        Produit produit2 = new Produit(2510,"Yaourt","Vitalait",1.500,new Date("2022/12/12"));
//        Produit produit3 = new Produit(3250,"Tomate,","Sicam", 1.200,new Date("2022/12/12"));
//        Produit produi5 = new Produit(3250,"Tomate,","Sicam", 1.200,new Date("2022/12/12"));
//        produits = List.of(produit1,produit2,produit3);
//        produit1.setPrix(1.500);
//        produit2.setPrix(0.500);
//        Magasin magasin = new Magasin();
//        Magasin magasin2 = new Magasin();
//        magasin.setId("M1");
//        magasin.setAddress("Tunis");
//        magasin2.setId("M2");
//        magasin2.setAddress("Sousse");
//
//        magasin.addProduit(produit1);
//        magasin.addProduit(produit2);
//        magasin.addProduit(produit3);
//        magasin.addProduit(produi5);
//        System.out.println(magasin);
//
//        magasin2.addProduit(produit1);
//        magasin2.addProduit(produit2);
//        magasin2.addProduit(produit3);
//
//        // afficher les libelle des produits
//        produits.forEach(produit -> {
//           System.out.println("libelle:  "+produit.getLibelle());
//        });
//
//        // affichage avec toString
//        produits.forEach(produit -> {
//            System.out.println(produit.toString());
//        });
//
//        // afficher le nombre total de produits dans tous les magasins
//        System.out.println("Nombre total de produits dans les  magasins: " + Produit.nbProduits);
//
//
//        Magasin magasinAvecPlusDeProduits = Magasin.getMagasinAvecPlusDeProduits(magasin, magasin2);
//        System.out.println("Le magasin avec le plus de produits est : " + magasinAvecPlusDeProduits.getId());
//
//
//        magasin.deleteProduit(produit1);
//        System.out.println("Nombre total de produits dans les  magasins: " + Produit.nbProduits);



//        Question 1
        Magasin magasin = new Magasin();
        magasin.setId(1);
        magasin.setNom("Carrefour");
        magasin.setAddress("Centre-Ville");

        Magasin magasin2 = new Magasin();
        magasin2.setId(2);
        magasin2.setNom("Monoprix");
        magasin2.setAddress("Menzah 6") ;

//        Question 2
        Caissier caissier = new Caissier(1, "Ali", "Tunis", 40, 1);
        Caissier caissier2 = new Caissier(2, "Ahmed", "Ariana", 40, 2);
        Vendeur vendeur = new Vendeur(3, "Mohamed", "Marsa", 40, 10);
        magasin.setEmployees(List.of(caissier,caissier2, vendeur));

        Vendeur vendeur2 = new Vendeur(4, "Sami", "Sousse", 40, 10);
        Vendeur vendeur3 = new Vendeur(5, "Sami", "Sousse", 40, 10);
        Vendeur vendeur4 = new Vendeur(6, "Sami", "Sousse", 40, 10);
        Responsable responsable = new Responsable(7, "Ali", "Tunis", 40, 100);
        magasin2.setEmployees(List.of(vendeur2, vendeur3, vendeur4, responsable));

//        Question 3
        System.out.println(caissier);
        System.out.println(vendeur);
        System.out.println(responsable);

//        Question 4

        Produit produit1 = new Produit(1, "Lait", "Delice", 1.500, new Date("2022/12/12"));
        Produit produit2 = new Produit(2, "Yaourt", "Vitalait", 1.500, new Date("2022/12/12"));
        Produit produit3 = new Produit(3, "Tomate", "Sicam", 1.200, new Date("2022/12/12"));

        magasin.addProduit(produit1);
        magasin.addProduit(produit2);
        magasin2.addProduit(produit3);

        //       Question 5
        System.out.println(magasin);
        System.out.println(magasin2);


        //       Question 6
        System.out.println(caissier.calculerSalaire());
        System.out.println(vendeur.calculerSalaire());
        System.out.println(responsable.calculerSalaire());
        System.out.println(caissier2.calculerSalaire());
        System.out.println(vendeur2.calculerSalaire());
        System.out.println(vendeur3.calculerSalaire());

        //       Question 7
        magasin.getEmployees().forEach(employee -> {
            if(employee instanceof Responsable){
                System.out.println(((Responsable) employee).getPrime());
            }
        });

        var totalSalary = 0.0;
        // Question 8
        for (Employee employee : magasin.getEmployees()) {
            totalSalary += employee.calculerSalaire();
        }
        System.out.println("Total Salary for magasin 1: " + totalSalary);

        var totalSalary2 = 0.0;
        for (Employee employee : magasin2.getEmployees()) {
            totalSalary2 += employee.calculerSalaire();
        }
        System.out.println("Total Salary for magasin 2: " + totalSalary2);

        // question 9

        magasin.getEmployees().forEach(employee -> {
            if(employee instanceof Responsable){
                System.out.println(((Responsable) employee).getPrime());
            }
        });

        // question 10

        System.out.println(caissier);
        System.out.println(vendeur);
        System.out.println(responsable);
        System.out.println(caissier2);
        System.out.println(vendeur2);
        System.out.println(vendeur3);
        System.out.println(vendeur4);

        // question 11






    }
}