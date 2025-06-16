package org.zzn.hospital.entitys;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.zzn.hospital.enums.Speciality;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Doctor extends Person{
    private Speciality speciality;

}
