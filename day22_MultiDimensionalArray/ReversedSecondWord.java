package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReversedSecondWord {
    public static void main(String[] args) {

        String sentence="I love Java";

        String[] words=sentence.split(" ");
        String reverse="";

        for(int i=words[1].length()-1;i>=0;i--){
           reverse+= words[1].charAt(i);

        }

        System.out.println(reverse);


       // sentence=sentence.replaceFirst(words[1],reverse);

        words[1]=reverse;
        System.out.println((Arrays.toString(words)));
        String result="";
        for (String each : words) {
           result+=each+" ";
        }

        System.out.println(result);










    }
}
/*2. Write a program that can reverse the second word of the sentence
Ex:
sentence = "I Love Java";
output:
I evoL Java

 */