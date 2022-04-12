package day38_Inheritance.carTask;

public class VW extends Car{

    public VW() {
    }

    public VW( String model, String color, double price, double miles, int year) {
        super("VW", model, color, price, miles, year);
    }
    public void racing(){
        System.out.println(brand + " " + model + " is racing");
    }

    public void wins(){
        System.out.println(model + " has won the race");
    }

    public String toString() {
        return "VW{" +
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
2. VW:
        extra methods
        racing()
        wins()
 */