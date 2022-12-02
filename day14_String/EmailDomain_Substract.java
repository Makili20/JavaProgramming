package day14_String;

public class EmailDomain_Substract {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        //domain:
        int beginingIndex = email.indexOf("@") + 1;
        int endingindex = email.lastIndexOf(".");

        String domain = email.substring(beginingIndex, endingindex);
        System.out.println("domain = " + domain);
        //String str1 = "Java is fun,Java is cool";
        // String s1 = str1.substring(0, 10+ 1);
        //System.out.println("s1 = " + s1);
        // String s1=str1.substring(0,str1.indexOf("n")+1);
        //int beg=str1.lastIndexOf("J")

        String str1 = "Java is fun, Java is cool, I love Java";
        //             0123456789
        //
        String s1 = str1.substring(0, 10+1) ;  // Java is fun

        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end );  //Java is cool


        String s3 = str1.substring(  str1.lastIndexOf("I")  );

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);





















    }
}
