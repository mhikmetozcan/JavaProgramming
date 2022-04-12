package day08_ifStatements;

public class IdentifyNumber {


    public static void main(String[] args) {


        int number = 200;

        boolean[] posNeg = {number>0 , number<0 , number==0};

        if(posNeg[0]) System.out.println(number + " is positive");
            else if (posNeg[1]) System.out.println(number + " is negative");
                else if (posNeg[2]) System.out.println(number + " is zero");
    }

}


/*
1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

 */