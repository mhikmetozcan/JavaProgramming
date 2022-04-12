package day23_CustomMethodsVoid;

import java.util.*;

public class CustomMethodsIntro {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = reverseNoSpec(in.next());
        System.out.println(str);

    }
    public static String reverseNoSpec(String str) {

        // your code here


        String [] chars = str.split("");
        String charsNoSpec = "";

        for (int a =  chars.length - 1; a >= 0; a--){
            if (!((chars[a].charAt(0) >= 'A' && chars[a].charAt(0) <= 'Z' ) || (chars[a].charAt(0) >= 'a' && chars[a].charAt(0) <= 'z' )))
                continue;
            charsNoSpec += chars[a];
        }

        for (int a =0, b = 0; a < chars.length && b < charsNoSpec.length(); a++){
            if (!((chars[a].charAt(0) >= 'A' && chars[a].charAt(0) <= 'Z' ) || (chars[a].charAt(0) >= 'a' && chars[a].charAt(0) <= 'z' )))
                continue;
            else{
                chars[a] = ""+charsNoSpec.charAt(b);
                b++;
            }
        }


        str = "";

        for (int a = 0; a < chars.length; a++){
            str += chars[a];
        }

        return str;

    }

}

