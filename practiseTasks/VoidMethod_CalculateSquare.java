package practiseTasks;

public class VoidMethod_CalculateSquare {
    public static void areaOfSquare(double side){
        double area = side * side;
        System.out.println("area = " + area);
    }

    public static void main(String[] args) {
        areaOfSquare(3);
    }
}
