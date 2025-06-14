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
@Data
public class Medecine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecine;
    private String nameMedecine;
    private String description;
    private int unite;





}
