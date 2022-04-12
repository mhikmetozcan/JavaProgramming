package day08_ifStatements;

import java.util.Scanner;

public class NameOfTheDay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter a number btw 1 and 7");
        int day= s.nextInt();
        while(day<1||day>7) {
            System.out.println("you did not provide within the range. Please enter a number from 1 to 7");
                day = s.nextInt();
        }
        switch (day){
            case(1):
            {System.out.println("Monday"); break;}
            case(2):
            {System.out.println("Tuesday"); break;}
            case(3):
            {System.out.println("Wednesday");break;}
            case(4):
            {System.out.println("Thursday");break;}
            case(5):
            {System.out.println("Friday");break;}
            case(6):
            {System.out.println("Saturday");break;}
            case(7):
            {System.out.println("Sunday");break;}
        }

    }
}
