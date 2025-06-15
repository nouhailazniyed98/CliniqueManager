package org.zzn.hospital.exceptions;

public class AppointmentNotFoundException extends RuntimeException {


    public AppointmentNotFoundException() {
        super("Appointment not found.");
    }

    public AppointmentNotFoundException(Long id) {
        super("Appointment not found with ID: " + id);
    }

    public AppointmentNotFoundException(String message) {
        super("Appointment not found: " + message);
    }
}
