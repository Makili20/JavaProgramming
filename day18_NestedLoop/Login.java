package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged In");
        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Invalid username or password,please re=enter");
                System.out.println("enter your username: ");
                u = scan.next();
                System.out.println("Enter your passwrod: ");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged In");
                    break;
                }
            }
        }

        if (!(u.equals("Cydeo") && p.equals("Cydeo123"))) {
            System.err.println("Your account is locked,Please contact support team");
        }


        scan.close();
    }
}

