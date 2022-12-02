package practiseTasks;
import java.util.Scanner;

public class WordStartsWithX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word=scan.next();
        scan.close();
String result="";
if(word.charAt(0)=='x'){
    System.out.println(word=word.substring(1));
}
        System.out.println(result);


    }
}
/*Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code

 */