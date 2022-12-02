package practiseTasks;

import java.util.Scanner;
import java.util.Scanner;

public class EnterAWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.next();
        String lastTwoChar = word.substring(word.length() - 2);
        if (lastTwoChar.equals("ly")) {
            System.out.println("Really?");
        } else {
            System.out.println("Never mind");

        }
    }
}
/*
ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"

 */