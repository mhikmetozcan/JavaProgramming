package day28_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

import static utilities.ArraysUtility.*;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList</*optional data type*/>();

        System.out.println(numbers/*has built in .toString() method*/);
        System.out.println(names);

        System.out.println(names.isEmpty());

        double[] arr = {1,2,4,5,6};

        arr = insert(arr, 2,3);

        System.out.println(Arrays.toString(arr));

        arr = swap(arr, 2,5);

        System.out.println(Arrays.toString(arr));

        groupChars("wooden spoon123!");

        System.out.println(upperLowerCaseEqual("wooden spoon123!"));
        System.out.println(upperLowerCaseEqual("aaaJJJ"));
    }
}
