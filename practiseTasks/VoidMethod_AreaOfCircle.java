package practiseTasks;

public class VoidMethod_AreaOfCircle {
   public static void areaOfCircle(double radius){
       double areaOfCircle = radius * radius * 3.14;
       System.out.println("Area of Circle is: "+areaOfCircle);
   }

    public static void main(String[] args) {
    areaOfCircle(6.5);
    }
}

