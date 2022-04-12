package day08_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {


        int number = 65;

        boolean by2 = number % 2 == 0;
        boolean by3 = number % 3 == 0;
        boolean by5 = number % 5 == 0;


        System.out.println(number + " is divisible by 2: " + by2);
        System.out.println(number + " is divisible by 3: " + by3);
        System.out.println(number + " is divisible by 5: " + by5);


    }
}

/*
Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */