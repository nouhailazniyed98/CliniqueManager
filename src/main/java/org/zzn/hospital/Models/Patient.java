package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import org.zzn.hospital.Enums.BloodType;

@Entity
public class Patient extends Person {
    private BloodType bloodType;
    private String cin;
    private Insurance insurance;

    public Patient() {}
    public Patient(Insurance insurance) {
        super();
        this.bloodType = bloodType;
        this.cin =cin;
        this.insurance = insurance;
    }
    public BloodType getBloodType() {return bloodType;}
    public void setBloodType(BloodType bloodType) {this.bloodType = bloodType;}
    public String getCin() {return cin;}
    public void setCin(String cin) {this.cin = cin;}
    public Insurance getInsurance() {return insurance;}
    public void setInsurance(Insurance insurance) {this.insurance = insurance;}

    @Override
    public String toString() {
        return "\n======= PATIENT FILE =======\n" +
                "ID               : " + getId() + "\n" +
                "First Name       : " + getFirstName() + "\n" +
                "Last Name        : " + getLastName() + "\n" +
                "Birthday         : " + getBirthday() + "\n" +
                "Sex              : " + getGender() + "\n" +
                "Address          : " + getAddress() + "\n" +
                "Phone Number     : " + getPhoneNumber() + "\n" +
                "Blood Type       : " + bloodType + "\n" +
                "CIN              : " + cin + "\n" +
                "------ Assurance Info ------\n" +
                "Company Name     : " + insurance.getCompanyName() + "\n" +
                "Coverage Type    : " + insurance.getTypeCoverage() + "\n" +
                "Assurance Phone  : " + insurance.getIphoneNumber() + "\n" +
                "=============================\n";
    }
}
