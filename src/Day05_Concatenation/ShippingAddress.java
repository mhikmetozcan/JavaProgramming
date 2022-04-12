package Day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Mustafa Hikmet Özcan";
        String hausNummer = "7a";
        String straße = "Kleiner Ring";
        String stadt = "Seck";
        String bundesLand = "Rheinland-Pfalz";
        String plz = "DE-56479";

        System.out.println("The shipping address is:\n" + name + "\n" + straße + " " + hausNummer + "\n" + plz + " " + stadt + "\n" + bundesLand);


    }
}

/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address
 */