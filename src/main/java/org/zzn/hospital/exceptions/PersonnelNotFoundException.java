package org.zzn.hospital.exceptions;

public class PersonnelNotFoundException extends RuntimeException {
    public PersonnelNotFoundException() {
        super("Personnel not found.");
    }

    public PersonnelNotFoundException(Long id) {
        super("Personnel not found with ID: " + id);
    }

    public PersonnelNotFoundException(String message) {
        super("Personnel not found: " + message);
    }
}
