package day43_Abstraction.car;

public class Honda extends Car {



    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("Push the Start button");
    }
}


class A{
    public static void main(String[] args) {
        Car car = new Honda("Civic", "Grey", 2000, 2500);
    }
}