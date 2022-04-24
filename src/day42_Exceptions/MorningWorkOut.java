package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("-------Push up started-------");

        for (int i = 1; i <= 30; i++) {

            System.out.println("push Up " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

/*
MorningWorkOut:
    1. Do 30 push-ups and try pausing 1.5 seconds in each

    2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */