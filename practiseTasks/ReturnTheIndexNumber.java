package practiseTasks;

public class ReturnTheIndexNumber {
    public static void main(String[] args) {
        String str = "abbcccddj";
        int index = 0;
        int frequency = 0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    frequency++;
                }

                if (frequency == 2) {
                    break;
                }

                index = str.indexOf(ch);

            }}

            System.out.println(index);

    }
}
       /* String str = "aabccdeef";
        String result = "";



        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(ch==each){
                    count++;
                }
            }

            if(count==2){
                result+=str.indexOf(ch);;
                break;
            }

        }

        System.out.println(result);

2. Write a program that cna return the index number of the first
duplicated character from a string*/

