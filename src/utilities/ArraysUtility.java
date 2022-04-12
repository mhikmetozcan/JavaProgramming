package utilities;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines
    public static void printEach(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }

    }

    // prints each double of a double array in separate lines
    public static void printEach(double[] arr){
        for (double i : arr) {
            System.out.println(i);
        }

    }

    // prints each char of a char array in separate lines
    public static void printEach(char[] arr) {
        for (char i : arr) {
            System.out.println(i);
        }
    }

    // prints each String of a String array in separate lines
    public static void printEach(String[] arr){
        for (String i : arr) {
            System.out.println(i);
        }

    }

    //returns the max from an integer array
    public static int findMax(int[] arr){

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max)
                max = arr[i];
        }

        return max;
    }

    //returns the max from an double array
    public static double findMax(double[] arr){

        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max)
                max = arr[i];
        }

        return max;
    }

    //returns the min from an integer array
    public static int findMin(int[] arr){

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min)
                min = arr[i];
        }

        return min;
    }

    //returns the max from an integer array
    public static double findMin(double[] arr){

        double min = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min)
                min = arr[i];
        }

        return min;
    }

    //checks if the given int exists inside the array
    public static boolean contains(int[] arr, int i){
        boolean check = false;
        for (int each : arr) {
            if (each == i)
                check = true;
        }

        return check;

    }

    //returns the frequency of the given element inside the given array
    public static int frequency(int[] arr, int i){

        int count = 0;
        for (int each : arr) {
            if (each == i){
                count++;
            }
        }

        return count;

    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }

    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    public static int[] insert(int[] arr, int index, int i) {

        int[] newArr = new int[arr.length + 1];

        for (int a = 0; a < index; a++) {
            newArr[a] = arr[a];
        }

        newArr[index] = i;

        for (int a = index + 1, j = index; a < newArr.length; a++, j++) {

            newArr[a] = arr[j];

        }


        return newArr;
    }

    public static double[] insert(double[] arr, int index, double i) {

        double[] newArr = new double[arr.length + 1];

        for (int a = 0; a < index; a++) {
            newArr[a] = arr[a];
        }

        newArr[index] = i;

        for (int a = index + 1, j = index; a < newArr.length; a++, j++) {

            newArr[a] = arr[j];

        }


        return newArr;
    }

    public static char[] insert(char[] arr, int index, char i) {

        char[] newArr = new char[arr.length + 1];

        for (int a = 0; a < index; a++) {
            newArr[a] = arr[a];
        }

        newArr[index] = i;

        for (int a = index + 1, j = index; a < newArr.length; a++, j++) {

            newArr[a] = arr[j];

        }


        return newArr;
    }

    public static String[] insert(String[] arr, int index, String i) {

        String[] newArr = new String[arr.length + 1];

        for (int a = 0; a < index; a++) {
            newArr[a] = arr[a];
        }

        newArr[index] = i;

        for (int a = index + 1, j = index; a < newArr.length; a++, j++) {

            newArr[a] = arr[j];

        }


        return newArr;
    }

    public static int[] swap(int[] arr, int i, int j){

        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;

        return arr;

    }

    public static double[] swap(double[] arr, int i, int j){

        double swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;

        return arr;

    }

    public static char[] swap(char[] arr, int i, int j){

        char swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;

        return arr;

    }

    public static String[] swap(String[] arr, int i, int j){

        String swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;

        return arr;

    }

    public static void groupChars(String str){

        String letters = "", digits = "", spec = "";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))){
                letters += "" + str.charAt(i);
            }else if(Character.isDigit(str.charAt(i))){
                digits += "" + str.charAt(i);
            }else{
                if(str.charAt(i) == ' ')// optional, instead of space character, writes underscore on the console
                    spec += "_";
                else
                spec += "" + str.charAt(i);
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("spec = " + spec);

    }

    public static boolean upperLowerCaseEqual(String str){

        int countUpperCase = 0, countLowerCase = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i)))
                countUpperCase++;
            else if(Character.isLowerCase(str.charAt(i)))
                countLowerCase++;
        }

        return countLowerCase == countUpperCase;
    }


}
