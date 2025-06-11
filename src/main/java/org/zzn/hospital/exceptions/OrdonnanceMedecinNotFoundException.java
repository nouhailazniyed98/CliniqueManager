package org.zzn.hospital.exceptions;

public class OrdonnanceMedecinNotFoundException extends RuntimeException {
    public OrdonnanceMedecinNotFoundException(String message) {
        super(message);
    }
}
