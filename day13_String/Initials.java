package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter yuour first name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();
scan.close();
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial =f +"."+ l;
        System.out.println("initial= " +initial);

    }
}
