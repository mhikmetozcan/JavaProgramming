package day16_ForLoopStringPractices;
import java.util.Scanner;
public class Reverse {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" enter a word to be reversed ");

        String reverse = "";

        String str = s.nextLine();

        for (int a = str.length()-1 ; a >= 0; a--)

            reverse += str.charAt(a);

        System.out.println("reverse = " + reverse);


        if (reverse.equals(str)) System.out.println(str + " is a palindrome");

        else System.out.println(str + " is not a palindrome");
    }

}
