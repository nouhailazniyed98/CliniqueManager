package org.zzn.hospital.Models;
import jakarta.persistence.Embeddable;

@Embeddable
public class Insurance {
    private String companyName;
    private String typeCoverage;
    private String IphoneNumber;

    public Insurance() {}
    public Insurance(String companyName, String typeCoverage, String iPhoneNumber) {
        this.companyName = companyName;
        this.typeCoverage = typeCoverage;
       this.IphoneNumber = iPhoneNumber;

    }
    public String getCompanyName() {return this.companyName;}
    public void setCompanyName(String companyName) {this.companyName = companyName;}
    public String getTypeCoverage() {return this.typeCoverage;}
    public void setTypeCoverage(String typeCoverage) {this.typeCoverage = typeCoverage;}

    public String getIphoneNumber() {
        return IphoneNumber;
    }
    public void setIphoneNumber(String iPhoneNumber) {this.IphoneNumber = iPhoneNumber;}

    @Override
    public String toString() {
        return "Insurance{" +
                "companyName='" + companyName + '\'' +
                ", typeCoverage='" + typeCoverage + '\'' +
                ", IphoneNumber='" + IphoneNumber + '\'' +
                '}';
    }
}
