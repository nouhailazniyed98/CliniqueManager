package org.zzn.hospital.entitys;

import jakarta.persistence.*;
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
    @Column(name="availability")
    private boolean availability;







}
