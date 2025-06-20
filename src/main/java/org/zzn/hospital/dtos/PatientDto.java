package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.enums.BloodType;
import org.zzn.hospital.enums.Gender;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String cin;
    private BloodType bloodType;
    private InsuranceDto insurance;
}
