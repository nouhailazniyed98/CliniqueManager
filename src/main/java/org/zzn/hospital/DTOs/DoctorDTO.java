package org.zzn.hospital.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zzn.hospital.Enums.Speciality;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorDTO {
    private String firstName;
    private String lastName;
    private String gender;
    private Speciality speciality;
    private String phoneNumber;
}
