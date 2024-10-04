package com.esprit;

import java.util.Arrays;

public class Magasin {

    private String id;
    private String address;
    private final Integer capacity = 50;
    private Produit[] produits = new Produit[capacity];
    private int produitCount = 0;

    public void addProduit(Produit produit) {
        if (existProduit(produit)) {
            System.out.println("Produit existe deja with the id: "+produit.getId());
            return;
        }
        if (produitCount < capacity) {
            produits[produitCount++] = produit;
        } else {
            System.out.println("Magasin is full");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public static Magasin getMagasinAvecPlusDeProduits(Magasin magasin1, Magasin magasin2) {
        if (magasin1.getProduits().length > magasin2.getProduits().length) {
            return magasin1;
        } else {
            return magasin2;
        }
    }

    public boolean deleteProduit(Produit produit) {
        for (int i = 0; i < produitCount; i++) {
            if (produits[i].compare(produit)) {
                produits[i] = produits[produitCount - 1];
                produits[produitCount - 1] = null;
                produitCount--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", produits=" + Arrays.toString(Arrays.copyOf(produits, produitCount)) +
                '}';
    }
}