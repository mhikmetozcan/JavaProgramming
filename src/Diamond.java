import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        System.out.println("how many lines?");
        int line = s.nextInt();
        for (int i = 0; i <= line; i++) {
            for (int b = line - i; b > 0; b--) {
                System.out.print("  ");
            }
            for (int a = 0; a < (2 * i - 1); a++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }

        int sp = 1;
        for (int i = line - 1; i >= 0; i--) {
            for (int space = 0; space < sp; space++) System.out.print("  ");
            for (int a = 0; a < 2 * i - 1; a++) {
                System.out.print("*" + " ");
            }


            System.out.println();
            sp++;

        }

    }

}