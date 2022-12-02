package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }

    }
    //returns the reversed String
    public static String reversed(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
    //checks if the given String is palindrome,returns boolean
    public static boolean isPalindrome(String str){
        return reversed(str).equalsIgnoreCase(str);
    }
    // checks if the given String is anagram,returns boolean
    public static boolean anagram(String str1,String str2){
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        Arrays.equals(ch1,ch2);
        return Arrays.equals(ch1,ch2);

    }

    //removes the duplicates from given string,returns String."aaaabbbbcccc.---->"abc"
    public static String removeDuplicates(String str){
        String  result="";
        for(int i=0;i<=str.length()-1;i++){//i:represents the index numbers of str
            String ch=""+str.charAt(i);    //represents each character of str
            if(!result.contains(ch)){    //if the character is not contained in the result
                result+=ch; //the character will be added to the result

            }}
        return result;



    }

}
