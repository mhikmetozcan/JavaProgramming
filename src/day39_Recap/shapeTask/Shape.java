package day39_Recap.shapeTask;

public class Shape {

    private String shape;

    public Shape(){

    }

    public Shape (String shape){
        setShape(shape);
    }

    public void setShape(String shape){
        if (shape == null || shape.isBlank() || shape.isEmpty()){
            System.err.println("invalid shape");
            System.exit(1);
        }
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public double area(){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shape='" + shape + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
