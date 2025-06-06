package org.zzn.hospital.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import org.zzn.hospital.Enums.Days;

import java.time.LocalTime;

@Entity
public class Appointment {
    @Id
    private Long id;
    private Days days;
    private LocalTime hour;

    @OneToOne(cascade = CascadeType.ALL)
    private AnnulationConfirmation annulationConfirmation;

    public Appointment() {}
    public Appointment(long id, Days days, LocalTime hour) {
        this.id = id;
        this.days = days;
    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public Days getDays() {return days;}
    public void setDays(Days days) {this.days = days;}
    public LocalTime getHour() {return hour;}
    public void setHour(LocalTime hour) {this.hour = hour;}
    public AnnulationConfirmation getAnnulationConfirmation() {
        return annulationConfirmation;
    }
    public void setAnnulationConfirmation(AnnulationConfirmation annulationConfirmation) {
        this.annulationConfirmation = annulationConfirmation;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", days=" + days +
                ", hour=" + hour +
                ", annulationConfirmation=" + annulationConfirmation +
                '}';
    }
}
