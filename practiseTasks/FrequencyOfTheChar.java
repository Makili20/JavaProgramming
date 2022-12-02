package practiseTasks;

import java.util.Scanner;

public class FrequencyOfTheChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string and a char: ");
        String str = scan.nextLine();
        char ch = scan.nextLine().charAt(0);
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if(eachChar==ch){
                frequency++;
            }

        }

        System.out.println(frequency);
    }
}

/*
2. Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */