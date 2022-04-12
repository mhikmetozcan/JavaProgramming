package utilities;

import java.util.Arrays;

public class StringUtility {


    //prints each char in a given String
    public static void printEachChar(String str){

        for (int a = 0; a < str.length(); a++) {
            System.out.println(str.charAt(a));
        }
        
    }


    // reverses the given String
    public static String reverse(String str){

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;

    }

    // if the string is palindrome?
    public static boolean isPalindrome(String str){

        String plndrm = reverse(str);

        return plndrm.equals(str);

    }

    // if two strings are anagram
    public static boolean isAnagram(String str, String str1){

        char[] ch1 = str.toCharArray();

        Arrays.sort(ch1);

        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);
    }

    //removes the duplicates from the given String
    public static String removeDuplicates(String str){

        String nonDuplicate = "";

        for (int i = 0; i < str.length(); i++) {

            if (!(nonDuplicate.contains(""+str.charAt(i)))){

                nonDuplicate += str.charAt(i);

            }

        }

        return nonDuplicate;

    }


}
