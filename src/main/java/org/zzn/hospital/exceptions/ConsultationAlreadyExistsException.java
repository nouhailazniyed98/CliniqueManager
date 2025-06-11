package org.zzn.hospital.exceptions;

public class ConsultationAlreadyExistsException extends RuntimeException {
    public ConsultationAlreadyExistsException(String message) {
        super(message);
    }
}
