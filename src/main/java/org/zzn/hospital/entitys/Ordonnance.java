package org.zzn.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdonnance;
    private String medecine;
    private LocalDate date;







}
