package org.zzn.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;
import org.zzn.hospital.Enums.Days;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Days day;

    private LocalTime hour;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    private AnnulationConfirmation annulationConfirmation;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }


}
