package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Tatiana", 'f', 28, 90000);
        System.out.println(emp1);
        Employee emp2 = new Employee("     ", 'h',563, -560);
        System.out.println(emp2);

    }
}
