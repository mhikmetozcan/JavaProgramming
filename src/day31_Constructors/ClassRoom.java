package day31_Constructors;

public class ClassRoom {

    public static void main(String[] args) {

        Student student1 = new Student("Hulya", 'F', 'B', 26, 13);
        Student student2 = new Student("Ali", 'M', 'A', 30, 42);
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}
