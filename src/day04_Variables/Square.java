package day04_Variables;
import java.util.Scanner;
public class Square {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter the length of the edge");
        int edge= s.nextInt();

        System.out.println("the area:" + edge*edge+ "\nthe perimeter: "+edge*4);

        char ch = 45026; // deneme, göerelim baklım ne çıkacak?

        System.out.println("ch = " + ch);
    }
}
