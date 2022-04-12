package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        ArrayList<String> students = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers.isEmpty());

        System.out.println(numbers);

        // .add(value) adds the value to the end of the ArrayList
        // .add(index, value) adds the value to the given index of the ArrayList

        numbers.add(10);

        System.out.println(numbers);

        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.add(2,25);

        System.out.println(numbers);
        System.out.println("numbers = " + numbers);

        // .size() methods is similar to .length

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        // .get(index) returns the element that is in the given index

        Integer num = numbers.get(2);
        int i = numbers.get(5);

        System.out.println("i = " + i);
        System.out.println("num = " + num);

        for (int a = 0; a < numbers.size(); a++) {

            System.out.println(numbers.get(a));

        }


        // .set(index, value) the given value is assigned to the given index

        numbers.set(3,33);

        System.out.println("numbers = " + numbers);

    }
}
