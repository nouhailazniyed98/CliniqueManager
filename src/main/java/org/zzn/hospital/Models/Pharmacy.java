package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPharmacy;
    private String namePharmacy;
    private String phoneNumber;
    private String emailPharmacy;


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
