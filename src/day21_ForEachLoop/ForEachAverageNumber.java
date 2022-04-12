package day21_ForEachLoop;

public class ForEachAverageNumber {

    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60,70};
        int sum = 0;

        for (int a : numbers) {
            sum += a;
        }

        System.out.println("the average is: "+ sum/numbers.length);
    }
}
