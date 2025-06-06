package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Outils {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOutils;
    private String nameOutils;
    private String description;
    private boolean availibility;

    public Outils() {}
    public Outils(int idOutils, String nameOutils, String description, boolean availibility) {
        this.idOutils = idOutils;
        this.nameOutils = nameOutils;
        this.description = description;
        this.availibility = availibility;
    }
    public int getIdOutils() {
        return idOutils;
    }
    public void setIdOutils(int idOutils) {
        this.idOutils=idOutils;
    }
    public String getNameOutils() {
        return nameOutils;
    }
    public void setNameOutils(String nameOutils) {
        this.nameOutils=nameOutils;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isAvailibility() {
        return availibility;
    }
    public void setAvailibility(boolean availibility) {
        this.availibility = availibility;
    }
    @Override
    public String toString() {
        return "Outils{" +
                "idOutils=" + idOutils +
                ", nameOutils='" + nameOutils + '\'' +
                ", description='" + description + '\'' +
                ", availibility=" + availibility +
                '}';
    }




}
