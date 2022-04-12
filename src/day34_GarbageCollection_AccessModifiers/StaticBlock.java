package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main method");

    }

    static {// runs before every other block or methods, runs only once
        System.out.println("Static Block");
    }


}
