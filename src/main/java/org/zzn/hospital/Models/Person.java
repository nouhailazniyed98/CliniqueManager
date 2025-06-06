package org.zzn.hospital.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.zzn.hospital.Enums.Gender;

import java.time.LocalDate;

@Entity
public class Person {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;

    public Person() {}
    public Person(String firstName, String lastName, Gender gender, LocalDate birthday, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}
    public LocalDate getBirthday() {return birthday;}
    public void setBirthday(LocalDate birthday) {this.birthday = birthday;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


}