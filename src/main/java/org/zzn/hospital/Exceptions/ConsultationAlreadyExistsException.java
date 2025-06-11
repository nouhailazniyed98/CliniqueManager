package org.zzn.hospital.Exceptions;

public class ConsultationAlreadyExistsException extends RuntimeException {
    public ConsultationAlreadyExistsException(String message) {
        super(message);
    }
}
