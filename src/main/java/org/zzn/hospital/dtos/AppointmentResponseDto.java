package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.enums.Days;

import java.time.LocalDateTime;
import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentResponseDto {
    private Long id;
    private Days day;
    private LocalTime hour;
    private LocalDateTime createdAt;
    private String patientName;
    private String doctorName;
    private AnnulationConfirmationDto annulationConfirmation;
}
