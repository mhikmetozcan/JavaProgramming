package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {
        int[] arr = {1,2,36,4,5,-5};
        ArraysUtility.printEach(arr);

        double[] arr1 = {1.1,-2.2,36.3,4.4,5.5};
        ArraysUtility.printEach(arr1);

        System.out.println("---------------------");

        System.out.println(ArraysUtility.findMax(arr));

        System.out.println(ArraysUtility.findMax(arr1));

        System.out.println(ArraysUtility.findMin(arr));

        System.out.println(ArraysUtility.findMin(arr1));

        System.out.println(ArraysUtility.contains(arr, 9));

        System.out.println(ArraysUtility.contains(arr, 4));

    }

}
