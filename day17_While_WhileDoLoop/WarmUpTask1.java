package day17_While_WhileDoLoop;
import java.util. Scanner;
public class WarmUpTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string and a char: ");
        String str=scan.next();
        char ch=scan.next().charAt(0);
        int frequency=0;//+1+1+1==>3

        for (int i=0;i<str.length();i++){//i:indexes of str
            char eachCh=str.charAt(i);//eachCh=each character of string
            if(eachCh==ch){//if given char is matching with eachCh character,then ch is appeared
                //in the string
                frequency++;
            }

        }

        System.out.println(frequency);






    }
}
/*Write a program that can return the frequency of a char from a
String
Ex:
str = "AAABBBC"
ch = 'A'
Output:
3

 */