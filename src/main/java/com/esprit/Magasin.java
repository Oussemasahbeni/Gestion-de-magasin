package com.esprit;

import java.util.Arrays;

public class Magasin {

    private String id;
    private String address;
    private final  Integer capacity = 50;
    private Produit[] produits = new Produit[capacity];

    public void addProduit(Produit produit) {
        Produit[] newProduits = new Produit[produits.length + 1];
        for (int i = 0; i < produits.length; i++) {
            newProduits[i] = produits[i];
        }
        newProduits[produits.length] = produit;
        produits = newProduits;
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", produits=" + Arrays.toString(produits) +
                '}';
    }
}