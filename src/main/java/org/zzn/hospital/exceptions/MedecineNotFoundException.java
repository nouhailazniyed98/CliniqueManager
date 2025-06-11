package org.zzn.hospital.exceptions;

public class MedecineNotFoundException extends RuntimeException{
    public MedecineNotFoundException(String message) {
        super(message);
    }
}
