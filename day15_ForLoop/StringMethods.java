package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty();
        System.out.println(r);
        System.out.println("----------------");


        boolean r1 = str.isBlank();
        System.out.println(r1);
        String str2 = "Cydeo";
        System.out.println(str2.isBlank());
        System.out.println("---------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("--------");

        String sentence = "My favourite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava3);
        System.out.println("-----------------");

        String input1 = "I love JaVa";
        String input2 = "Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//false
        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true
        System.out.println("---------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        System.out.println(x);
        boolean y = a.endsWith("Spoon");
        System.out.println(y);
        boolean z=a.toLowerCase().startsWith("wooden");//in order to ignore the case sensitivity we first create the lower
        //case of upper case version of string and then compareit to the upper case or lower case.
        System.out.println(z);

    }
}
