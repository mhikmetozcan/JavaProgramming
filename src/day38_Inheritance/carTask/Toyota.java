package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota() {
    }

    public Toyota(String model, String color, double price, double miles, int year) {
        super("Toyota", model, color, price, miles, year);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is a reliable car.");
    }

    @Override
    public void start(){
        System.out.println("Insert the key to start " + brand + " " + model);
    }

    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", miles=" + miles +
                ", year=" + year +
                '}';
    }
}
/*
Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()
 */