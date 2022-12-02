package practiseTasks;

import java.util.Scanner;

public class TwoPositiveNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 2 positive numbers: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;
        scan.close();
        for (int i = 0; i < num2; i++) {
            result += num1;

        }

        System.out.println("Multiplication: " + result);
        System.out.println("Invalid number");


    }
}
/*
Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */