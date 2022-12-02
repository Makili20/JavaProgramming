package practiseTasks;

import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = scan.nextLine();

        int totalChar = sentence.length();
        char lastChar = sentence.charAt(totalChar - 1);

        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------");

/*2. write a program that asks user to enter two strings, and print out the
longest string

 */
        System.out.println("Enter your first string of text: ");
        String firstString = scan.nextLine();
        System.out.println("Enter your second string of text: ");
        String secondString = scan.nextLine();
        scan.close();

        if (firstString.length() > secondString.length()) {
            System.out.println(firstString);
        }
        else if(secondString.length()>firstString.length()){
            System.out.println(secondString);}

        else{
            System.out.println("Both have the same length");


        }
    }}
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */