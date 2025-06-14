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
public class Outils {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOutils;
    private String nameOutils;
    private String description;
    private boolean availibility;







}
