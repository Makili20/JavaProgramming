package day09_IfStatements;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        String word;

        if (n % 3 == 0) {
            word = "Fizz";
        } else if (n % 5 == 0) {
            word = "Buzz";
        } else {
            word = "FizzBuzz";
        }

        System.out.println(word);


    }
}
/*1. Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3,
prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz


 */