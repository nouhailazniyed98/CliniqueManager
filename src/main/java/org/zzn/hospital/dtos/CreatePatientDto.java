package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.enums.BloodType;
import org.zzn.hospital.enums.Gender;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreatePatientDto {
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
