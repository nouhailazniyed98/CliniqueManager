package org.zzn.hospital.exceptions;

public class OrdonnanceNotFoundException extends RuntimeException{
    public OrdonnanceNotFoundException(String message) {
        super(message);
    }
}
