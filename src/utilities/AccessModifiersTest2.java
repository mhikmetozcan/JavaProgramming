package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTest2 extends ProtectedAccessModifier {

    public static void main(String[] args) {

  //    System.out.println(AccessModifiersTest2.name1); // default is not visible outside the package
        System.out.println(AccessModifiersTest2.name2);

    }
}
