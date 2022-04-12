package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {


        Dog quchu = new Dog();
        quchu.name = "Quchuquchu";
        quchu.breed = "German Shepherd";
        quchu.age = 5;
        quchu.gender = 'M';
        quchu.size = "Medium";
        quchu.color = "Mustard";

        System.out.println(quchu);

        Dog puppy = new Dog();
        puppy.name = "Ace";
        puppy.breed = "Husky";
        puppy.age = 2;
        puppy.gender = 'M';
        puppy.size = "Large";
        puppy.color = "Black & White";
        System.out.println(puppy);

        Dog guard = new Dog();
        guard.setInfo("Jack", "Dobbermann", 2 ,'M', "Large", "Black");
        System.out.println(guard);

        quchu.sleep();
        puppy.eat();
        guard.bark();
    }

}
