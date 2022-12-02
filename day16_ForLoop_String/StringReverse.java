package day16_ForLoop_String;

public class StringReverse {
    public static void main(String[] args) {

        String str = "I love Java";
        //index:    0123456.....
        String result = "";//contain reverse version of str
        // noops nedoow
        //11
       /* result += str.charAt(str.length() - 1);//n
        result += str.charAt(10);//o
        result += str.charAt(9);//o
        result += str.charAt(8);//p
        .....
        */
        for(int i=str.length()-1;i>=0;i--){//starting from last index to index 0
            result+=str.charAt(i);//adding each char to result

        }



        System.out.println(result);



    }
}
/*. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW

 */