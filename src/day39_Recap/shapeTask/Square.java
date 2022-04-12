package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side < 0){
            System.err.println("Invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square() {
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area(){
        return Math.pow(side, 2);
    }

    @Override
    public double perimeter(){
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

class A{
    public static void main(String[] args) {
        Square a = new Square(5.5);
        System.out.println(a.area());
        System.out.println(a);


    }
}