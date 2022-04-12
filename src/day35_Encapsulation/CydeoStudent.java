package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public String fieldOfStudy;
    private String iBan;

    public static String programmingLanguage;
    public static String schoolName;
    public static String secretCode;


    public String getiBan() {
        return iBan;
    }

    public void setiBan(String iBan) {
        this.iBan = iBan;
    }

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        programmingLanguage = "Java";
        schoolName = "Cydeo";
        secretCode = "Wooden Spoon";

    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }

    public static void printProgrammingLanguage() {
        System.out.println("language is " + programmingLanguage);
    }

    public static void printSchoolName() {
        System.out.println("school is " + schoolName);
    }

    public static void printSecretCode() {
        System.out.println("code is " + secretCode);
    }

    public void attendClass() {
        System.out.println(name + " is attending class. ");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }






}
