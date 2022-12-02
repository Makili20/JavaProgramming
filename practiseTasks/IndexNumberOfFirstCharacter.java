package practiseTasks;

public class IndexNumberOfFirstCharacter {
    public static void main(String[] args) {
        String str ="aabmbcdd";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch==each){
                    count++;
                }
            }
            if(count==1){
                System.out.println(" first unique char index is "+str.indexOf(ch));
                break;
            }
        }




















        }
}
/*
4. Write a program that can return the index number of the first
unique character.
 */