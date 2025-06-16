package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.entitys.Medecine;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdonnanceDTO {
    private Medecine medecine;
    private LocalDate date;
}
