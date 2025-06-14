package org.zzn.hospital.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutilsDto {
    private int idOutils;
    private String nameOutils;
    private String description;
    private boolean availability;

}
