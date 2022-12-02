package day16_ForLoop_String;

public class Palindrome {

    public static void main(String[] args) {
        
        String word="Level";
        
       String reversed="";
       for(int i=word.length()-1;i>=0;i--){
           reversed+=word.charAt(i);
       }
        boolean isPalindrome=word.equalsIgnoreCase(reversed);


        System.out.println("Is Palindrome: "+ isPalindrome);



    }
}
/*
'java'==> "avaJ"==>false
"Anna"==> "anna"==> true

"level"
"Racecar"
Dad
Mom
....
 */