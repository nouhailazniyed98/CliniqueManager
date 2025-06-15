package org.zzn.hospital.exceptions;

public class DoctorNotFoundException extends RuntimeException{

    public DoctorNotFoundException() {
        super("Doctor not found.");
    }

    public DoctorNotFoundException(Long id) {
        super("Doctor not found with ID: " + id);
    }

    public DoctorNotFoundException(String detail) {
        super("Doctor not found: " + detail);
    }
}
