package day16_ForLoopStringPractices;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        // CAN BE MADE WITH CONTINUE

        for (int a = 0; a < str.length()-1; a++) {

            char ch = str.charAt(a);

                
                if (str.substring(a+1).indexOf(ch) != -1)
                    
            str = str.substring(0,a+1)+str.substring(a+1).replace(""+str.charAt(a),"");
                

        }

        System.out.println("str = " + str);
            

    }
}
