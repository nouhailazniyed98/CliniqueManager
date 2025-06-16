package org.zzn.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
@Builder
public class Consultation {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsultation;
    private String diagnostic;
    private String remarque;


    @Override
    public String toString() {
        return "Consultation{" +
                "idConsultation=" + idConsultation +
                ", diagnostic='" + diagnostic + '\'' +
                ", remarque='" + remarque + '\'' +
                '}';
    }


}
