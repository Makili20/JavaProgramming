package day13_String;


public class StringIntro {
    public static void main(String[] args) {


        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";

        System.out.println(name == name2);//true

        System.out.println("---------------");

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1 == str2);//false
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println("------------");

        String s1 = "Java";
        String s2 = new String("Java");//if J is small letter it will come back as false because
        // Java is case sensitive language

        System.out.println(s1.equals(s2));


    }


}
