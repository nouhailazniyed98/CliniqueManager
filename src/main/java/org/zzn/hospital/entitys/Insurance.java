package org.zzn.hospital.entitys;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Insurance {
    private String companyName;
    private String typeCoverage;
    private String IphoneNumber;

}
