package practiseTasks;

public class Wrapper_retrieve {
    public static void main(String[] args) {
        String str="Wooden Spoon!";
        String letters="";
        String digits="";
        String specialChar="";

        for(int i=0;i<str.length();i++){
           char each=str.charAt(i);
           if(Character.isLetter(each)){
               letters+=each;
           }else if(Character.isDigit(each)){
               digits+=each;
           }else{
               specialChar+=each;
           }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);

    }
}
/*. Write a program that can retrieve the letters, digits and special
characters from the string
Ex:
str = "Wooden Spoon!"
output:
letters= "WoodenSpoon";
Digits = "";
specialChars = " !";

 */