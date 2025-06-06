package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.zzn.hospital.Enums.TypeAction;

import java.time.LocalDate;

@Entity
public class AnnulationConfirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateAction;
    private TypeAction typeAction;

    public AnnulationConfirmation() {}
    public AnnulationConfirmation(LocalDate dateAction, TypeAction typeAction) {
        this.id = id;
        this.dateAction = dateAction;
        this.typeAction = typeAction;

    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public LocalDate getDateAction() {return dateAction;}
    public void setDateAction(LocalDate dateAction) {this.dateAction = dateAction;}
    public TypeAction getTypeAction() {return typeAction;}
    public void setTypeAction(TypeAction typeAction) {this.typeAction = typeAction;}

    @Override
    public String toString() {
        return "AnnulationConfirmation{" +
                "id=" + id +
                ", dateAction=" + dateAction +
                ", typeAction=" + typeAction +
                '}';
    }
}
