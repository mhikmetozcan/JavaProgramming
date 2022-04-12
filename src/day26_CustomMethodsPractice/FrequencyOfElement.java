package day26_CustomMethodsPractice;

public class FrequencyOfElement {

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

    public static void main(String[] args) {

        int[] arr = {2,3,2,6,5,2,2,3,9};

        System.out.println(frequency(arr, 2));
    }

}
