package practiseTasks;

import java.util.Scanner;

public class SameCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        scan.close();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if (firstChar == lastChar) {
            System.out.println("Same");
        } else {
            System.out.println("Not the same");


        }
    }}

/*3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same

 */