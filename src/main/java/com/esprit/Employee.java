package com.esprit;

import java.util.Objects;

public class Employee {

    private Integer id;
    private String nom;
    private String address;
    private int nbr_heures;

    public Employee(Integer id, String nom, String address, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.address = address;
        this.nbr_heures = nbr_heures;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }


    public double calculerSalaire() {
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return nbr_heures == employee.nbr_heures && Objects.equals(id, employee.id) && Objects.equals(nom, employee.nom);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", address='" + address + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }
}
