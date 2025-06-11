package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String bloodType;
    private String cin;
    private InsuranceDTO insurance;
}
