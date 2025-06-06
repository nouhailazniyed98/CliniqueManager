package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import org.zzn.hospital.Enums.Gender;

@Entity
public class Personnel extends Person {
    private String post;
    private String service;

    public Personnel() {}
    public Personnel(String post, String service, Gender gender) {
        super();
        this.post = post;
        this.service = service;

    }
    public String getPost() {return post;}
    public void setPost(String post) {this.post = post;}
    public String getService() {return service;}
    public void setService(String service) {this.service = service;}

    @Override
    public String toString() {
        return "\n======= PERSONNEL FILE =======\n" +
                "ID             : " + getId() + "\n" +
                "First Name     : " + getFirstName() + "\n" +
                "Last Name      : " + getLastName() + "\n" +
                "Birthday       : " + getBirthday() + "\n" +
                "Sex            : " + getGender() + "\n" +
                "Address        : " + getAddress() + "\n" +
                "Phone Number   : " + getPhoneNumber() + "\n" +
                "Post           : " + post + "\n" +
                "Service        : " + service + "\n" +
                "==============================\n";
    }
}
