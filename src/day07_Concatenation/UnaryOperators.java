package day07_Concatenation;

public class UnaryOperators {

    public static void main(String[] args) {
        
        int a = 5;
        
        ++a; // pre-increment: increases the value by 1 right away

        System.out.println("a = " + a); // will print 6
        
        --a; // pre-decrement: decrases the value by 1 right away

        System.out.println("a = " + a); // will print 5

    //    a++; // post-increment: first apply the current value then increases by 1

        System.out.println("a = " + a++); // will print 5 and increse it to 6

    //    a--; // post-decrement: first apply the current value then decreases by 1

        System.out.println("a = " + a--); // will print 6 and then reduces by 1

        System.out.println("fiinal a = " + a);

    }
}
