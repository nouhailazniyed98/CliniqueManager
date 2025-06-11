package org.zzn.hospital.entitys;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Personnel extends Person {
    private String post;
    private String service;
}
