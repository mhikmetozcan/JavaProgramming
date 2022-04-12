package day36_Inheritance.animalTask;

import day36_Inheritance.animalTask.Animal;

public class Cat extends Animal { // Cat Is An Animal

    public void meow(){

        System.out.println(name + " meows");
    }

    public void scratch(){
        System.out.println(name + " scratches");
    }

}

    /*

    All 6 variables and methods of Animal class are inherited

     */