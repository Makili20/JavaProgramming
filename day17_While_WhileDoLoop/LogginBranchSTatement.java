package day17_While_WhileDoLoop;

import java.util.Scanner;

public class LogginBranchSTatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged In");

        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username: ");
                username = scan.next();
                System.out.println("Enter your password: ");
                password = scan.next();

                if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                    System.out.println("Logged In");
                    break;
                }
            }

            if( !(username.equals("Cydeo") && password.equals("Cydeo123")) ){
                System.err.println("Your account is locked,Please contact support team!");
            }
        }


    }
}
/*
You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: Cydeo123
Ask the user to enter their credentials.
If credentials are matched, your program should print
"Logged in."
If the credentials are not matched, the program should
allow the user to have three attempts to enter correct credentials and if
all three attempts are failed, then print "Your account is locked."
 */