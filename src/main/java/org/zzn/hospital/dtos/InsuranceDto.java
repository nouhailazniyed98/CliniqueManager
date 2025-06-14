package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceDto {
    private String companyName;
    private String typeCoverage;
    private String iphoneNumber;
}
