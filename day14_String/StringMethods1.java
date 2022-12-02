package day14_String;

import javax.lang.model.SourceVersion;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "  batch 25    ";
        str1 = str1.trim(); // creates a new string and will not include wild spaces
        //"batch 25"// you always need to assign back the variable

        System.out.println(str1);

        String str2 = "Cydeo School";
//IndexOf and lastIndexOf Methods

        int n1 = str2.indexOf("h");
        System.out.println("n1= " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("amm");
        System.out.println("n3 = " + n3);

        System.out.println("-----------");

        String s = "Java Nova Cava Wawa Orange";
        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        //Options:
        // int fourthA = s.indexOf("ava W");
        // int fourthA=s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        System.out.println("fourthA = " + fourthA);

        int fifthA = s.lastIndexOf("va")+1;
       // int fifthA=s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);

        int sixthA=s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

       // int seventhA=s.lastIndexOf("a o");
        int seventhA=s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);


    }
}
