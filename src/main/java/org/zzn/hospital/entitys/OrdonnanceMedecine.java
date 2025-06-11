package org.zzn.hospital.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class OrdonnanceMedecine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdonnanceMedecine;
    private double quantity;
    private double dausage;



    @Override
    public String toString() {
        return "OrdonnanceMedecine{" +
                "idOrdonnanceMedecine=" + idOrdonnanceMedecine +
                ", quantity=" + quantity +
                ", dausage=" + dausage +
                '}';
    }


}
