package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPharmacy;
    private String namePharmacy;
    private String phoneNumber;
    private String emailPharmacy;

    public Pharmacy() {}

    public Pharmacy(int idPharmacy, String namePharmacy, String phoneNumber, String emailPharmacy) {
        this.idPharmacy=idPharmacy;
        this.namePharmacy=namePharmacy;
        this.phoneNumber=phoneNumber;
        this.emailPharmacy=emailPharmacy;
    }

    public int getIdPharmacy() {
        return idPharmacy;
    }
    public void setIdPharmacy(int idPharmacy) {
        this.idPharmacy = idPharmacy;
    }
    public String getNamePharmacy() {
        return namePharmacy;
    }
    public void setNamePharmacy(String namePharmacy) {
        this.namePharmacy = namePharmacy;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailPharmacy() {
        return emailPharmacy;

    }
    public void setEmailPharmacy(String emailPharmacy) {
        this.emailPharmacy = emailPharmacy;
    }
    @Override
    public String toString() {
        return "Pharmacy{" +
                "idPharmacy=" + idPharmacy +
                ", namePharmacy='" + namePharmacy + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailPharmacy='" + emailPharmacy + '\'' +
                '}';
    }


}
