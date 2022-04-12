package day30_CustomClass;

public class CommerzBank {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        Employee emp6 = new Employee();


        emp1.setInfo("Hikmet", 'M', 28, 1, "FI(A)", 20_000, true);
        emp2.setInfo("john", 'M', 25, 12, "DEV", 50_000, true);
        emp3.setInfo("Anna", 'F', 35, 123, "QA", 40_000, true);
        emp4.setInfo("David", 'M', 28, 1234, "QA", 25_000, false);
        emp5.setInfo("Lina", 'F', 45, 12345, "Manager", 70_000, true);
        emp6.setInfo("Kevin", 'M', 38, 123456, "Senior QA", 110_000, true);


        Employee[] emps = {emp1, emp2, emp3, emp4, emp5, emp6};

        //count of full time emps

        int countFullTime = 0;
        int countPartTime = 0;
        for (Employee emp : emps) {
            if (emp.isFullTime)
                countFullTime++;
            else countPartTime++;
        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println(emp1);

    }

}
