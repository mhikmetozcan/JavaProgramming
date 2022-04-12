package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        String name,company, jobTitle;
        int age,salary;
        double yearsOfExperience;
        char gender;
        boolean isFullTime,isMarried;

        name ="Mustafa Hikmet Özcan";
        age= 28;
        gender= 'M';
        company ="AAFC";
        jobTitle= "flight instructor";
        yearsOfExperience= 2.5;
        salary= 20000;
        isFullTime= true; isMarried = true;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("salary = " + salary);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
    }
}
