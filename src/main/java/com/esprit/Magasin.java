package com.esprit;

import java.util.Arrays;
import java.util.List;

public class Magasin {

    private final Integer CAPACITY = 2;
    private final Integer MAX_EMPLOYEES = 20;

    private Integer id;
    private String address;
    private String nom;
    private Produit[] produits = new Produit[CAPACITY];
    private int produitCount = 0;
    private List<Employee> employees;

    public void addProduit(Produit produit) throws MagasinPleinException, PrixNegatifException {
        if (existProduit(produit)) {
            System.out.println("Produit existe deja with the id: " + produit.getId());
            return;
        }
        if (produit.getPrix() < 0) {
            throw new PrixNegatifException("Prix doit etre positif");
        }
        if (produitCount < CAPACITY) {
            produits[produitCount++] = produit;
        } else {
            throw new MagasinPleinException("Magasin is full");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Produit[] getProduits() {
        return Arrays.copyOf(produits, produitCount);
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
        this.produitCount = produits.length;
    }

    public boolean existProduit(Produit produit) {
        for (int i = 0; i < produitCount; i++) {
            if (produits[i].compare(produit)) {
                return true;
            }
        }
        return false;
    }


    public void afficherNomreEmployeeParType(){
        int responsableCount = 0;
        int caissierCount = 0;
        int vendeurCount = 0;
        for (Employee employee : employees) {
            if (employee instanceof Responsable) {
                responsableCount++;
            } else if (employee instanceof Caissier) {
                caissierCount++;
            } else if (employee instanceof Vendeur) {
                vendeurCount++;
            }
        }
        System.out.println("Nombre de responsables: " + responsableCount);
        System.out.println("Nombre de caissiers: " + caissierCount);
        System.out.println("Nombre de vendeurs: " + vendeurCount);

    }

    public static Magasin getMagasinAvecPlusDeProduits(Magasin magasin1, Magasin magasin2) {
        if (magasin1.getProduits().length > magasin2.getProduits().length) {
            return magasin1;
        } else {
            return magasin2;
        }
    }

    public void deleteProduit(Produit produit) {
        for (int i = 0; i < produitCount; i++) {
            if (produits[i].compare(produit)) {
                produits[i] = produits[produitCount - 1];
                produits[produitCount - 1] = null;
                produitCount--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "CAPACITY=" + CAPACITY +
                ", MAX_EMPLOYEES=" + MAX_EMPLOYEES +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", nom='" + nom + '\'' +
                ", produits=" + Arrays.toString(produits) +
                ", produitCount=" + produitCount +
                ", employees=" + employees +
                '}';
    }
}