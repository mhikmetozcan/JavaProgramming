package day38_Inheritance.carTask;

public class Tesla extends Car{

    public Tesla() {
    }

    public Tesla( String model, String color, double price, double miles, int year) {
        super("Tesla", model, color, price, miles, year);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " is on the autopilot");
    }

    public String toString() {
        return "Tesla{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", miles=" + miles +
                ", year=" + year +
                '}';
    }
}
