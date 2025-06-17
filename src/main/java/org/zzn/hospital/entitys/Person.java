package org.zzn.hospital.entitys;

import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.SuperBuilder;
import org.zzn.hospital.enums.Gender;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;

}