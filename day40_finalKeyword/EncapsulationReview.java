package day40_finalKeyword;

import day39_Recap.shapeClass.Circle;
import day39_Recap.shapeClass.Square;

public class EncapsulationReview {

    private Circle circle;
    private Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle){
        if(circle.getRadius() < 5){
            return;
        }
        this.circle=circle;
    }








}
