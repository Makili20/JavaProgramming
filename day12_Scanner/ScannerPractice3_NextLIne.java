package day12_Scanner;

import java.util.Scanner;


public class ScannerPractice3_NextLIne {

    public static void main(String[] args) {

        //123Enter
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();//reads everything until you press Enter

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine();//JavaProgrammingLanguageEnter

        System.out.println("enter your age:");
        int age = input.nextInt();//24

        input.nextLine();//Enter

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();//Enter

        System.out.println("full Name= " + programming);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        input.close();

    }
}
