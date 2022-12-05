package day39_Recap.shapeClass;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);

        square.setSide(15);
        System.out.println(square);

        Rectangle rectangle=new Rectangle(5,10);
        System.out.println(rectangle);

    }
}
