package com.esprit;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Responsable extends Employee{

    private Integer prime;

    public Responsable(Integer id, String nom, String address, int nbr_heures, Integer prime) {
        super(id, nom, address, nbr_heures);
        this.prime = prime;
    }
    @Override
    public double calculerSalaire() {
        int regularHours = min(this.getNbr_heures(), 160);
        int overtimeHours = max(this.getNbr_heures() - 160, 0);
        double regularPay = regularHours * 10;
        double overtimePay = overtimeHours * 10 * 1.2;
        return regularPay + overtimePay + prime;
    }

    public Integer getPrime() {
        return prime;
    }

    public void setPrime(Integer prime) {
        this.prime = prime;
    }


    @Override
    public String toString() {
        return "Responsable{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", nbr_heures=" + getNbr_heures() +
                "prime=" + prime +
                '}';
    }
}
