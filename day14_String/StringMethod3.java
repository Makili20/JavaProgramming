package day14_String;

public class StringMethod3 {
    public static void main(String[] args) {
        //substring(beginningIndex , endingIndex): creates substring starting
        //from the given beginning index till the given edning index (ending index
        //is excluded)

        String word = "Cydeo School";
        String brand = word.substring(0, 4 + 1);
        System.out.println("brand = " + brand);

        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" "));//Java
        System.out.println("s1 = " + s1);
        String s2 = word2.substring(word2.indexOf(" ") + 1, word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2);
        //Programming
        String s3 = word2.substring(word2.lastIndexOf(" ") + 1);//Language
        System.out.println("s3 = " + s3);

        String word3 = "Python C# Ruby";


    }
}
