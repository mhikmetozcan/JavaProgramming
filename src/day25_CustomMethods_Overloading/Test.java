package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("----------------------------");

        System.out.println(StringUtility.reverse(str));

        System.out.println("----------------------------");

        System.out.println(StringUtility.isPalindrome("ey edip adanada pide ye"));

        System.out.println("----------------------------");

        System.out.println(StringUtility.isAnagram("silent", "listen"));

        System.out.println("----------------------------");

        System.out.println(StringUtility.removeDuplicates("aaabbbcccdddeeeaafffgghhh"));
    }

}
