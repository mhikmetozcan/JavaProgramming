package day38_Inheritance.carTask;

public class Garage {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Celica", "silver", 2300, 230000,2003);
        VW vw = new VW("Golf VII Variant", "Bronze", 12000,150000,2016);
        Tesla tesla = new Tesla("Model S", "red", 35000, 0, 2022);

        toyota.start();
        vw.start();
        tesla.start();
        Toyota toyota1 = new Toyota("Celica", "silver", 2300, 230000,2003);

        System.out.println(tesla.equals(toyota)); // false, obviously
        System.out.println(toyota.equals(toyota1)); // false, but no idea why
        toyota1 = toyota;
        System.out.println(toyota.equals(toyota1)); // true

    }
}
