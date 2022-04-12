package day34_GarbageCollection_AccessModifiers;

public class Cosntructor_vs_StaticBlock {

    static{
        System.out.println("static block");
    }

    public Cosntructor_vs_StaticBlock(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new Cosntructor_vs_StaticBlock();
        new Cosntructor_vs_StaticBlock();
        new Cosntructor_vs_StaticBlock();
        new Cosntructor_vs_StaticBlock();
        new Cosntructor_vs_StaticBlock();
        new Cosntructor_vs_StaticBlock();
    }
}
