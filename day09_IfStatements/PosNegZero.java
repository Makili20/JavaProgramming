package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int n = 100;

        if (n > 0) {
            System.out.println("Positive");
            //this way is not efficient,do not use single if statement
        }
        if (n < 0) {
            System.out.println("Negative");
        }
        if (n == 0) {
            System.out.println("Zero");
        }
        System.out.println("-------------------");

        boolean positive = n > 0;
        boolean negative = n < 0;


        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        System.out.println("-------------------");
//if and else statement we can never apply for the tasks tnat requires more than two conditions

    }

}
