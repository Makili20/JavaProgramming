package practiseTasks;

public class day27_LettersDigitsSpecChar {
    public static void main(String[] args) {

    String str = "Wooden Spoon!";
    String letters="";
    String digits="";
    String specChar="";

    for(int i=0;i<str.length();i++){
        char each=str.charAt(i);
        if(Character.isLetter(each)){
            letters+=each;
        }else if(Character.isDigit(each)){
            digits += each;
        }else{
            specChar += each;
        }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specChar);
    }
}
/*3. Write a program that can retrieve the letters, digits and special
characters from the string
Ex:
str = "Wooden Spoon!"
output:
letters= "WoodenSpoon";
Digits = "";
specialChars = " !";

 */