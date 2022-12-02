package day17_While_WhileDoLoop;

import java.util.Scanner;

public class Loggin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //username: "Cydeo"
        //password:"Cydeo123"
        //int attempt = 3;
        //while(invalid && hasAttempts
        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in.");
        } else {
            int attempts = 3;//the only time that user would be able to re-enter is if the credentials are invalid
            // and attempt number is >0 and <=3
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {
                if(attempts==1){
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Incorrect username or password,please re-enter");
                System.out.println("Enter your username:");
                username = scan.next();
                System.out.println("Enter your password");
                password = scan.next();
                attempts--;
            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in.");
            } else {
                System.out.println("Your account is locked");
            }

        }

        scan.close();


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