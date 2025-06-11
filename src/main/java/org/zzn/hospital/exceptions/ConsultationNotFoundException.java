package org.zzn.hospital.exceptions;

public class ConsultationNotFoundException extends RuntimeException {
    public ConsultationNotFoundException(String message) {
        super(message);
    }
}
