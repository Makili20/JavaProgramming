package practiseTasks;
import java.util.Scanner;
public class SpecialCharacters {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scan=new Scanner(System.in);
        String str=scan.next();

        String letters="";
        String digits="";
        String specialChar="";

        for(int i=0; i<str.length(); i++ ){

            char ch= str.charAt(i);

            if(ch>='A' && ch<='Z'){
                letters += ch;
            }
            else if(ch>='a' && ch<='z'){
                letters+=ch;
            }
            else if(ch>='0' && ch<='9'){
                digits+=ch;
            }

            else{
                if(ch != ' '){
                    specialChar+=ch;
                }
            }}

            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);
            System.out.println("specialChar = " + specialChar);















































    }
}
/*5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!

 */