package day24_CustomsMethodsRutern;

import java.util.Arrays;
import java.util.Scanner;

public class WarmupTasks {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int [][] num = new int [s.nextInt()][s.nextInt()];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = s.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(num));

        int [][] reversed = new int[num.length][num[0].length];

        for (int i = num.length - 1, k = 0 ; i >= 0; i--, k++) {
            for (int j = num[i].length - 1, l = 0; j >= 0; j--, l++) {

                reversed[k][l] = num[i][j];

            }
        }


       // System.out.println(Arrays.deepToString(reversed));

        for (int[] ints : reversed) {
            System.out.println(Arrays.toString(ints));
        }


    }

}


