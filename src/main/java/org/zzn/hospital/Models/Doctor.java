package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import org.zzn.hospital.Enums.Speciality;

@Entity
public class Doctor extends Person{
    private Speciality speciality;

    public Doctor() {}
    public Doctor(Speciality speciality) {
        super();
        this.speciality = speciality;
    }
    public Speciality getSpeciality() {
        return speciality;
    }
    public void setSpeciality(Speciality speciality) {this.speciality = speciality;}

    @Override
    public String toString() {
        return "\n===== DOCTOR PROFILE =====\n" +
                "ID           : " + getId() + "\n" +
                "First Name   : " + getFirstName() + "\n" +
                "Last Name    : " + getLastName() + "\n" +
                "Birthday     : " + getBirthday() + "\n" +
                "Gender       : " + getGender() + "\n" +
                "Address      : " + getAddress() + "\n" +
                "Phone Number : " + getPhoneNumber() + "\n" +
                "Speciality   : " + speciality + "\n" +
                "===========================\n";
    }
}
