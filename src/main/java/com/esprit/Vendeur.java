package com.esprit;

public class Vendeur extends Employee{

    private Integer tauxDeVente;

    public Vendeur(Integer id, String nom, String address, int nbr_heures, Integer tauxDeVente) {
        super(id, nom, address, nbr_heures);
        this.tauxDeVente = tauxDeVente;

    }

    public Integer getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(Integer tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }


    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100.0);
    }


    @Override
    public String toString() {
        return "Vendeur{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", nbr_heures=" + getNbr_heures() +
                ", tauxDeVente=" + tauxDeVente +
                '}';
    }
}
