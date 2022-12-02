package practiseTasks;

public class ReturnDuplicates {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each)
                    frequency++;
            }

            if (result.contains(""+ ch)) {
                break;
            }

            result += ch;
        }

        System.out.println(result);


    }
}
/*1. Write a program that can return the first duplicated character
from a string
Another solution:

 String str = "ABBCDDE";
        String result = "";

        for (int j = 0; j < str.length(); j++) { // i: represents all index numbers of str
            int count = 0;
            char ch = str.charAt(j); // represents each Character of str



            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

/*
            if(count == 2){ // if the frequency of the character is 2, then the character is  NOT unique
                result += ch;
            }

            if(count == 2){
                    result += ch;
                    break;
                    }

                    }


                    System.out.println(result);
 */