package practiseTasks;

import java.util.Scanner;

public class UserInitials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your lastNAme: ");
        String lastName = scan.next();
scan.close();

char f=firstName.toUpperCase().charAt(0);
char l=lastName.toUpperCase().charAt(0);
String initials= f+"."+l;
        System.out.println("initials = " + initials);


    }
}
/*4. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output

 */