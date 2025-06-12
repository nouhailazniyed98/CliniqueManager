package org.zzn.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonnelDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String cin;
    private String post;
    private String service;
}
