package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.enums.Days;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    private Long id;
    private Days day;
    private LocalTime hour;
    private LocalDateTime createdAt;
    private Long doctorId;
    private Long patientId;
    private AnnulationConfirmationDto annulationConfirmation;
}
