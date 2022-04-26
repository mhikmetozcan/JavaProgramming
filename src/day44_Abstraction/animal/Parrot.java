package day44_Abstraction.animal;

public final class Parrot extends Animal{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating sweets");
    }

    public void squawk(){
        System.out.println(getName() + " squawking 7000");
    }
}
