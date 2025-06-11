package org.zzn.hospital.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medecine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecine;
    private String nameMedecine;
    private String description;
    private int unite;

    public Medecine() {}
    public Medecine(Long idMedecine, String nameMedecine, String description) {
        this.idMedecine = idMedecine;
        this.nameMedecine = nameMedecine;
        this.description = description;
        this.unite=unite;
    }

    public Long getIdMedecine() {
        return idMedecine;
    }
    public void setIdMedecine(Long idMedecine) {
        this.idMedecine = idMedecine;
    }
    public String getNameMedecine() {
        return nameMedecine;
    }
    public void setNameMedecine(String nameMedecine) {
        this.nameMedecine = nameMedecine;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getUnite() {
        return unite;
    }
    public void setUnite(int unite) {
        this.unite = unite;
    }

    @Override
    public String toString() {
        return "Medecine{" +
                "idMedecine=" + idMedecine +
                ", nameMedecine='" + nameMedecine + '\'' +
                ", description='" + description + '\'' +
                ", unite=" + unite +
                '}';
    }


}
