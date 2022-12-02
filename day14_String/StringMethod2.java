package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        //replace(oldValue,newValue

        String str = "Java is fun,I love learning Java";
        String str1 = str.replace("Java", "Python");
        System.out.println("str1 = " + str1);
        System.out.println("str = " + str);


        String email1 = "JohnSmith@yahoo.com";
        String email2 = email1.replace("yahoo.com", "gmail.com");
        System.out.println("email1 = " + email1);
        System.out.println("email2 = " + email2);

        String sentence1 = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence1.replace("Python", " ");
        sentence2 = sentence2.replace("  ", " ");

        System.out.println("sentence1 = " + sentence1);
        String sentence3 = sentence2.replace("   ", " ");
        System.out.println("sentence3 = " + sentence3);

        String s = "Dog Dog Dog Dog Dog Dog";
        String s1 = s.replace("Dog", "Cat");
        System.out.println("s1 = " + s1);

        String s2 = "C# is fun, C# is cool";
        //String s3=s2.replace("C#", "Java");
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3);

        //replaceFirst method replaces just the First matching old values with the new ones.

        String result = "Java Java Java";
        // result=result.replace("Java", "Python");//all three of them will be replaced
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);

        String result2 = "C# is fun,C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);


    }
}
