package day31_Constructors.scrumTask;

public class Developer {
    public String name, jobTitle;
    public long employeeID;
    public double salary;

    public Developer(String name, String jobTitle, long employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + " is coding.");
    }
    public void unitTesting(){
        System.out.println(name + " is performing unit testing.");
    }
    public void fixingBug(){
        System.out.println(name + " is fixing bugs.");
    }

    public String toString() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
