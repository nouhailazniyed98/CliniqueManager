package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.enums.TypeAction;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnnulationConfirmationDto {
    private Long id;
    private LocalDate dateAction;
    private TypeAction typeAction;
    private Long appointmentId;
    private Long patientId;
    private String patientName;
}
