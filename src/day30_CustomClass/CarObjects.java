package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    
    public static void main(String[] args) {
    
        Car mcQueen = new Car();

        System.out.println("mcQueen = " + mcQueen);

        mcQueen.setInfo("Dodge", "Viper", "Red", 2022, 129000.99);

        System.out.println("mcQueen = " + mcQueen);

        Car kitt = new Car();

        kitt.setInfo("Pontiac", "Firebird", "Black", 1982, 100_000.0);

        System.out.println("kitt = " + kitt);

        Car celica = new Car ();

        celica.setInfo("Toyota", "Celica", "Silver", 2003, 2500);

        System.out.println("celica = " + celica);


        ArrayList<Car> carList = new ArrayList<>();

        carList.addAll(Arrays.asList(mcQueen, kitt, celica));

        System.out.println("--------------------------------------------");

        for (Car each : carList) {
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("--------------------------------------------");

    }
}
