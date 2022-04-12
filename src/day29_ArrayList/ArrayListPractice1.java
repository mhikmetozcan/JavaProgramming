package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        /*
        *
        * 1. create an Array of String called countries
        * 2. remove all the country names that is longer than 10 chars
        * */

        String[] countries = {"Democratic Congo Republic", "Argentina", "Yugoslavia", "Germany", "Italy", "United States"};

        System.out.println("countries = " + Arrays.toString(countries));

        ArrayList<String> shortCountries = new ArrayList<>(Arrays.asList(countries));

        shortCountries.removeIf( p -> p.length() >= 10);

        System.out.println("shortCountries = " + shortCountries);

        countries = shortCountries.toArray(new String[0]);

        System.out.println("countries = " + Arrays.toString(countries));

    }
}
