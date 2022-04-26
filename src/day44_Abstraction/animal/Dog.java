package day44_Abstraction.animal;

public final class Dog extends Animal{ // Final keyword so that the dog class will not be a parent of another animal class ever

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName() + " is barking on the wrong tree");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats Pizza");
    }
}
