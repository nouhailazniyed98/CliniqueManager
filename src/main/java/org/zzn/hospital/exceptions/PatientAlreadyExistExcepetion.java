package org.zzn.hospital.exceptions;

public class PatientAlreadyExistExcepetion extends RuntimeException{
    public PatientAlreadyExistExcepetion(){
        super("Patient alredy exist");
    }
}
