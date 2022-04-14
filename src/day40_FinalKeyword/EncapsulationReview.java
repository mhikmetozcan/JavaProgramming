package day40_FinalKeyword;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Square square;

    public Square getSquare(){
        return square;
    }

    public void setSquare(Square square){
        if(square.getSide() < 0){
            System.err.println("Invalid side: " + square.getSide());
            System.exit(1);
        }
        this.square = square;
    }

}
