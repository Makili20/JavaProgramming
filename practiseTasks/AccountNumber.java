package practiseTasks;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account number: ");
        String account = scan.next();
        scan.close();

        String result = "";

        if (account.charAt(0) == '2') {
            if (account.length() == 7) {
                result = "Valid";
            }
        } else if (account.charAt(0) == '5') {
            if (account.length() == 10) {
                result = "Valid";
            }
        } else {
            System.out.println(result="Invalid");
        }
        System.out.println(result);


    }
}

/*
Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long.
A

 */