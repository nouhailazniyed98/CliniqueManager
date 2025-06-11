package org.zzn.hospital.exceptions;

public class MedecineALreadyExistsException extends RuntimeException{
    public MedecineALreadyExistsException(String message) {
        super(message);
    }
}
