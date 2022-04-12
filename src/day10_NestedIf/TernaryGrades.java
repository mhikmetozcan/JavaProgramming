package day10_NestedIf;

import java.util.Scanner;

public class TernaryGrades {
    public static void main(String[] args) {

        System.out.println("enter the score");
        Scanner s = new Scanner(System.in);

        int score = s.nextInt();

        String str = (0 <= score && score <= 100)? (score>=90) ? "Excellent" :(score>=80)? "Great" : (score>=70)? "Good" : (score>=60) ? "Passed" : "Failed" : "Invalid score";
        boolean b = !false;
        System.out.println(str);
        System.out.println("b = " + b);
    }

}
