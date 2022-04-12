package day30_CustomClass;

public class Dog {


    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;

    }
}

/*

Attributes:
    name, age, gender, breed, size, color...


Actions:
    eat(), play(), sleep(), bark()...



 */