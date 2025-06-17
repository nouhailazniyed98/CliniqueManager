package org.zzn.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.SuperBuilder;
import org.zzn.hospital.enums.BloodType;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
@SuperBuilder
public class Patient extends Person {
    @Enumerated(EnumType.STRING)
    private BloodType bloodType;
    @Column(unique = true)
    private String cin; //Cin should be unique
    @Embedded
    private Insurance insurance;

}
