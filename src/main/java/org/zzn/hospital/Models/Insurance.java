package org.zzn.hospital.Models;
import jakarta.persistence.Embeddable;

@Embeddable
public class Insurance {
    private String companyName;
    private String typeCoverage;
    private String phoneNumber;

    public Insurance() {}
    public Insurance(String companyName, String typeCoverage, String phoneNumber) {
        this.companyName = companyName;
        this.typeCoverage = typeCoverage;
        this.phoneNumber = phoneNumber;

    }
    public String getCompanyName() {return this.companyName;}
    public void setCompanyName(String companyName) {this.companyName = companyName;}
    public String getTypeCoverage() {return this.typeCoverage;}
    public void setTypeCoverage(String typeCoverage) {this.typeCoverage = typeCoverage;}
    public String getPhoneNumber() {return this.phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    @Override
    public String toString() {
        return "insurance{" +
                "companyName='" + companyName + '\'' +
                ", typeCoverage='" + typeCoverage + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
