package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>(Arrays.asList("michael", "matthias", "hans", "oliver", "florian", "pedro", "aidan"));
        
        employees.retainAll(Arrays.asList("michael", "matthias"));

        System.out.println("employees = " + employees);

        String [] names = {"mary", "monica", "mehray", "musti", "sümeyra", "hasan", "beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf( p-> p.startsWith("m"));

        System.out.println("list = " + list);

        names = list.toArray(new String[0]);

        System.out.println("names = " + Arrays.toString(names));
        
        
    }
}
