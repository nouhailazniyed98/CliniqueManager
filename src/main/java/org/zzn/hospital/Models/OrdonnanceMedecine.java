package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrdonnanceMedecine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdonnanceMedecine;
    private double quantity;
    private double dausage;

    public OrdonnanceMedecine() {}

    public OrdonnanceMedecine(Long idOrdonnanceMedecine, double quantity, double dausage) {
        this.idOrdonnanceMedecine = idOrdonnanceMedecine;
        this.quantity = quantity;
        this.dausage = dausage;
    }

    public Long getIdOrdonnanceMedecine() {
        return idOrdonnanceMedecine;
    }

    public void setIdOrdonnanceMedecine(Long idOrdonnanceMedecine) {
        this.idOrdonnanceMedecine = idOrdonnanceMedecine;
    }

    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public double getDausage() {
        return dausage;
    }
    public void setDausage(double dausage) {
        this.dausage = dausage;
    }

    @Override
    public String toString() {
        return "OrdonnanceMedecine{" +
                "idOrdonnanceMedecine=" + idOrdonnanceMedecine +
                ", quantity=" + quantity +
                ", dausage=" + dausage +
                '}';
    }


}
