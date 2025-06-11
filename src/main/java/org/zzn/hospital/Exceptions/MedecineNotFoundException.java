package org.zzn.hospital.Exceptions;

public class MedecineNotFoundException extends RuntimeException{
    public MedecineNotFoundException(String message) {
        super(message);
    }
}
