package day31_Constructor;

public class Offer {

    public String location;
    public String companyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTIme;

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTIme) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTIme = isFullTIme;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTIme=" + isFullTIme +
                '}';
    }
}
/*Offer Task:
1. Create a custom class named Offer
Attributes:
location,
companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
Actions:
setInfo(): sets all the
instance variables
toString(): returns the full
info of the Offer Object

 */