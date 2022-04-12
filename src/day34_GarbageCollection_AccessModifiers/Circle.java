package day34_GarbageCollection_AccessModifiers;

public class Circle {

    public double radius; //instance variable. Needs an object to be initialized
    public static double pi; //static variable. Needs not any object to be initialized

    public Circle(double radius){
        this.radius = radius;
        // pi = 3.14;  // pi is static
    }

    static {// will run firstly and only once. can be used to initialize all the static variables.
        pi = 3.14;
    }

}
