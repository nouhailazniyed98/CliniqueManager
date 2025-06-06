package org.zzn.hospital.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdonnance;
    @ManyToOne
    @JoinColumn(name = "medecine_id_medecine")
    private Medecine medecine;
    private LocalDate date;

    public Ordonnance() {}
    public Ordonnance(Medecine medecine, LocalDate date) {
        this .idOrdonnance=idOrdonnance;
        this.medecine = medecine;
        this.date = date;
    }

    public Long getIdOrdonnance() {
        return idOrdonnance;
    }
    public void setIdOrdonnance(Long idOrdonnance) {
        this.idOrdonnance = idOrdonnance;
    }
    public Medecine getMedecine() {
        return medecine;
    }
    public void setMedecine(Medecine medecine) {
        this.medecine = medecine;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Ordonnance{" +
                "idOrdonnance=" + idOrdonnance +
                ", medecine=" + (medecine != null ? medecine.getNameMedecine() : "null") +
                ", date=" + date +
                '}';
    }


}
