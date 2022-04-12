package day02_HelloWorld;


public class HelloCydeo {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");

        int end = 11;

        while (end % 2 == 1){

            if (end > 1)

                System.out.print(end + ", ");

            else

                System.out.println(end);

            end-=2;
        }


        }
    }


