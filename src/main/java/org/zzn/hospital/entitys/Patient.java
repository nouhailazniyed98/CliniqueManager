package org.zzn.hospital.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.*;

import org.zzn.hospital.enums.BloodType;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
@Builder
public class Patient extends Person {
    private BloodType bloodType;
    @Column(unique = true)
    private String cin; //Cin should be unique
    @Embedded
    private Insurance insurance;

}
