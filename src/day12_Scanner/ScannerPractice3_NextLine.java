package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Enter your full name:");
        
        String name = s.nextLine();

        s.nextInt(); s.nextInt(); s.nextInt();
        s.nextLine(); // one nextLine() method is enough to clear all the enters stored in the memory
        String str = s.nextLine();
        System.out.println("str = " + str);



    }

}
