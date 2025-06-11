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
public class Medecine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecine;
    private String nameMedecine;
    private String description;
    private int unite;


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
