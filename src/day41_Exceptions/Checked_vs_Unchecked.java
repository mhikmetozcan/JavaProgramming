package day41_Exceptions;

import day31_Constructors.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {


        //unchecked exception

        int i = 10;
        int j = 0;

        System.out.println(i/j); // Arithmetic exception

        int[] arr = new int[5];
        System.out.println("arr[99] = " + arr[99]); // ArrayIndexOutOfBounds exception

        Student student = null;
        System.out.println(student.name); //NullPointerException


        //Checked exception


    //    Thread.sleep(3000);

    }
}
