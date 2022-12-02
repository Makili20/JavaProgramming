package practiseTasks;

public class ReturnAllCharacters {
    public static void main(String[] args) {
        String str = "anabbccdd";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch==each){
                    count++;
                }
            }
            if(!result.contains(ch+"")&&count==2){
                result+=ch;
            }
        }
        System.out.println(result);


    }


}
/*
3. Write a program that can display all the characters that appeared
twice in the string.
 */