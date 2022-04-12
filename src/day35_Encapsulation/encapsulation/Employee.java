package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(){

    }
    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName(){
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setName(String name){
        if(name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name= " + name);
            System.exit(0);
        }
        this.name = name;
    }

    public void setGender(char gender){
        if(!(gender == 'M' || gender == 'm'|| gender == 'F' || gender == 'f' )){
            System.err.println("Invalid gender= " + gender);
            System.exit(0);
        }
        this.gender = gender;
    }

    public void setAge(int age){
        if(age <= 16 || age > 65){
            System.err.println("Invalid Age: "+age);
            System.exit(0);
        }
        this.age = age;
    }

    public void setSalary(double salary){

        if (salary <= 0){
           System.err.println("Invalid Salary: "+salary);
           System.exit(0);
        }
        this.salary = salary;
    }

}
