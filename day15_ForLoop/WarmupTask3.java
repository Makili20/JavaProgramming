package day15_ForLoop;

import java.util.Scanner;

public class WarmupTask3 {
    public static void main(String[] args) {

        System.out.println("Enter your first name: ");
        String firstName = new Scanner(System.in).next();
        System.out.println("Enter your last name: ");
        String lastName = new Scanner(System.in).next();
       firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //C                                            //ydeo==> 'Cydeo"

        System.out.println(firstName);
//Second option: firstName=("" + firstName.charAt(0)).toUpperCase()+
// firstName.substring(1).toLowerCase();
lastName=lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        System.out.println(lastName);

        String fullName=firstName+ " "+lastName;

        System.out.println(fullName);







    }
}
/*3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School

 */