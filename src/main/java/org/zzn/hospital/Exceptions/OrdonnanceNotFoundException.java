package org.zzn.hospital.Exceptions;

public class OrdonnanceNotFoundException extends RuntimeException{
    public OrdonnanceNotFoundException(String message) {
        super(message);
    }
}
