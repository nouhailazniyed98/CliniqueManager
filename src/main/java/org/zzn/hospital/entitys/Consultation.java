package org.zzn.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;
import  org.zzn.hospital.repositories.ConsultationRepository;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Consultation {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsultation;
    private String diagnostic;
    private String remarque;




}
