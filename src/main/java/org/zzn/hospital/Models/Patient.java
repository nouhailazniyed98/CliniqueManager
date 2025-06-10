package org.zzn.hospital.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.zzn.hospital.Enums.BloodType;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter 
@Builder
public class Patient extends Person {
    private BloodType bloodType;
    @Column(unique = true)
    private String cin; //Cin should be unique
    private Insurance insurance;

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
