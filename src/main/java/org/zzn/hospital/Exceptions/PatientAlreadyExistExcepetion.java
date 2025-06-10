package org.zzn.hospital.Exceptions;

public class PatientAlreadyExistExcepetion extends RuntimeException{
    public PatientAlreadyExistExcepetion(){
        super("Patient alredy exist");
    }
}
