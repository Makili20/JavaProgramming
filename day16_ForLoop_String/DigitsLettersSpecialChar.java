package day16_ForLoop_String;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {

        String str = "Cydeo123456School!@#$%WoodenSpoon";
        String letters = "";
        String digits = "";
        String specialChar = "";

        for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch>='0' && ch<='9'){
              digits+=ch;
          }
         else if(ch>='A' && ch<='Z'){
              letters+=ch;
          }
            else if(ch>='a' && ch<='z'){
                letters+=ch;
          }
            else{
                if(ch!=' ')
                    specialChar+=ch;
          }
        }


        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);






    }
}
