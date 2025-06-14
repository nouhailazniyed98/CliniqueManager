package org.zzn.hospital.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdonnanceMedecineDto {
    private Long idOrdonnanceMedecine;
    private double quantity;
    private double dausage ;
}
