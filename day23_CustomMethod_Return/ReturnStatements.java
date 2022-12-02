package day23_CustomMethod_Return;

public class ReturnStatements {
    public static void main(String[] args) {

        nameOfDay(6);


    }

    public static void nameOfDay(int number) {
        if (number < 1 || number > 7) {
            return;//exists nameOfDay method
        }
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

    }
}
//4. Create a method that can print the name of the day based on the
// given number to the method