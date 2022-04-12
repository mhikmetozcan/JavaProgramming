package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,3,5,9,43,6,5,83));

        Collections.sort(list);

        System.out.println("list = " + list);

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A','B','C','D','E'));

        Collections.reverse(chars);

        System.out.println("chars = " + chars);

        Collections.swap(list, 3,6);

        System.out.println("list = " + list);

    }
}
