package day31_Constructors;

public class Student {
    public String name;
    public char gender;
    public char grade;
    public int age;
    public int id;

    public Student(String name, char gender, char grade, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
