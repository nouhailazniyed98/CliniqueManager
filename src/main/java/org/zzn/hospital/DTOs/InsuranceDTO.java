package org.zzn.hospital.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceDTO {
    private String companyName;
    private String typeCoverage;
    private String iphoneNumber;
}
