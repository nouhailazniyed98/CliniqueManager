package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consultation {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsultation;
    private String diagnostic;
    private String remarque;

    public Consultation() {}
    public Consultation(Long idConsultation, String diagnostic, String remarque) {
        this.idConsultation = idConsultation;
        this.diagnostic = diagnostic;
        this.remarque = remarque;

    }
    public Long getIdConsultation() {
        return idConsultation;
    }
    public void setIdConsultation(Long idConsultation) {
        this.idConsultation = idConsultation;
    }
    public String getDiagnostic() {
        return diagnostic;
    }
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;

    }
    public String getRemarque() {
        return remarque;
    }
    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }
    @Override
    public String toString() {
        return "Consultation{" +
                "idConsultation=" + idConsultation +
                ", diagnostic='" + diagnostic + '\'' +
                ", remarque='" + remarque + '\'' +
                '}';
    }


}
