package com.esprit;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Caissier extends Employee{

    private Integer numeroDeCaisse;

    public Caissier(Integer id, String nom, String address, int nbr_heures, Integer numeroDeCaisse) {
        super(id, nom, address, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    @Override
    public double calculerSalaire() {
        int regularHours = min(this.getNbr_heures(), 180);
        int overtimeHours = max(this.getNbr_heures() - 180, 0);
        double regularPay = regularHours * 5;
        double overtimePay = overtimeHours * 5 * 1.15;
        return regularPay + overtimePay;
    }

    public Integer getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(Integer numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }


    @Override
    public String toString() {
        return "Caissier{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", nbr_heures=" + getNbr_heures() +
                "numeroDeCaisse=" + numeroDeCaisse +
                '}';
    }
}
