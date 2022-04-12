package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("numbers = " + numbers);

        Collections.swap(numbers, 0 , numbers.size() - 1); // swaps first and last elements

        System.out.println("numbers = " + numbers);

    }
}
