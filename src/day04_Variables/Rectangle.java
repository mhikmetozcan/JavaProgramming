package day04_Variables;
import java.util.Scanner;
public class Rectangle {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("enter the width");
        int width = s.nextInt();
        System.out.println("enter the length");
        int length = s.nextInt();

        System.out.println("the area: "+ width*length + "\nthe perimeter: "+ (width+length)*2);
    }
}
