package day32_Constructors;

public class EmployeeS {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Aaron");
        System.out.println(emp1);

        Employee emp2 = new Employee("Yuliya", 'F');
        System.out.println(emp2);

        Employee emp3 = new Employee("Olga", "SDET", 'F');
        System.out.println(emp3);


    }
}
