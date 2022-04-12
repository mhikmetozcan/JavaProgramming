package day21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {


        int [] numbers = {10,20,30,40,50,60,70};
        int count = 0;
        for (int a :
                numbers) {
        //    if (count == numbers.length-3) break;
        //      if (count < numbers.length-4) {count++; continue;}
            System.out.print(a + " ");
        //   count ++;
        }


    }
}
