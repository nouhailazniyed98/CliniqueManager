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
    @ManyToOne
    @JoinColumn(name = "medecine_id_medecine")
    private Medicine medecine;
    private LocalDate date;







}
