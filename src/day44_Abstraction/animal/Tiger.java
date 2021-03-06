package day44_Abstraction.animal;

public final class Tiger extends Animal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats");
    }

    public void hunts(){
        System.out.println(getName() + " stabs his claws to the prey's face");
    }
}
