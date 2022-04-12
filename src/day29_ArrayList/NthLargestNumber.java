package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(6,3,25,36,215,32,6,8,5,215,3,1,5,87,4,6,87,9,87,452));

        ArrayList<Integer> uniqueNums = new ArrayList<>();

        System.out.println("greatest number at which order?");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int swap = 0;

        for (int i = 0; i < nums.size(); i++) {

            for (int j = 0; j < nums.size(); j++) {

                if (nums.get(j) > nums.get(i)){

                    swap = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, swap);

                }

            }

        }

        System.out.println("Sorted nums = " + nums);

        for (Integer i : nums) {
            if(!uniqueNums.contains(i)){
                uniqueNums.add(i);
            }
        }

        System.out.println("uniqueNums = " + uniqueNums);

        System.out.println(uniqueNums.get(uniqueNums.size()-n));



    }
}