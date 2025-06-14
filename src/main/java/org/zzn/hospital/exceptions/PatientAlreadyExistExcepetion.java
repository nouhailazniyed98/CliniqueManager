package org.zzn.hospital.exceptions;

public class PatientAlreadyExistExcepetion extends RuntimeException{
    public PatientAlreadyExistExcepetion(){
        super("Patient alredy exist");
    }
    public PatientAlreadyExistExcepetion(String cin) {
        super("A patient with CIN " + cin + " already exists.");
    }
}
