package day19_LoopSummary;

import java.util.Scanner;

public class OddOrEven_ExitProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }

            System.out.println("Would you like to enter another number?yes/no");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {//if the answer is invalid
                System.err.println("Your answer is invalid!");
                System.exit(0);
            }

            if (a.equals("no")) {
                System.out.println("Thank you for using Cydeo calculator!");
                break;
            }
        }
        scan.close();





















    }
}
