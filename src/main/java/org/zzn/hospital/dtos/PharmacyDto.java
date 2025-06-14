package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PharmacyDto {
    private int idPharmacy;
    private String namePharmacy;
    private String phonePharmacy;
    private String emailPharmacy;
}
