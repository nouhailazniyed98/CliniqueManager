package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.enums.Gender;
import org.zzn.hospital.enums.Speciality;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private Speciality speciality;
}
