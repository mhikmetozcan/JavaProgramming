package day38_Inheritance.carTask;

public class Car {

    public String brand, model, color;
    public double price, miles;
    public int year;

    public Car() {
    }

    public Car(String brand, String model, String color, double price, double miles, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.miles = miles;
        this.year = year;
    }


    public void start(){
        System.out.println(brand + " " + model + " has started");
    }

    public void drive(){
        System.out.println(brand + " " + model + " is on the road");
    }

   public String toString() {
        return "Car{" +
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
Warmup task:
	carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();
 */