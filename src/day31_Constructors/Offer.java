package day31_Constructors;

public class Offer {

    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, isFullTime;
    public boolean hasPTO; // paid time-off
    public boolean isWFH; // work from home

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean isFullTime, boolean hasPTO, boolean isWFH) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isFullTime = isFullTime;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
    }

    public String  toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", isFullTime=" + isFullTime +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                '}';
    }
}

/*
Offer Task:
		1. Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object
 */