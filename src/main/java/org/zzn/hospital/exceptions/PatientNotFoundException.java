package org.zzn.hospital.exceptions;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException() {
        super("Patient not found.");
    }

    public PatientNotFoundException(Long id) {
        super("No patient found with ID: " + id);
    }

    public PatientNotFoundException(String cin) {
        super("No patient found with CIN: " + cin);
    }
}
