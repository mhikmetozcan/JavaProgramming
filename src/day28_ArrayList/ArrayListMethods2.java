package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println("list = " + list);

        int i = 1;

        list.remove(i); // removes by index, and int needs to be given

        System.out.println("list = " + list);

        Integer j = 200;

        list.remove(j); // removes by the object. the first object that matches the argument will be removed. returns boolean. if smt is removed returns true otherwise returns false

        System.out.println("list = " + list);

        System.out.println(list.remove(j));

        // .clear() deletes all the elements from the array list
    }
}
