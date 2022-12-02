package practiseTasks;

public class ReturnTheIndex1 {
    public static void main(String[] args) {

        String str = "abnndjjd";
        int index = 0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (!(str.indexOf(ch) == str.lastIndexOf(ch))) {
                index += ch;
                index = str.indexOf(ch);
                break;

            }


        }

        System.out.println(index);


    }
}
