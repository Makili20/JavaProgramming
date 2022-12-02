package day23_CustomMethod_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
      String result=removeDuplicates("cccbbbbfffggg")  ;
        System.out.println(result);
    }
    public static String removeDuplicates(String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);

            if(!result.contains(""+each)){
                result+=each;
            }
        }
        return result;
    }








}
/*1. create a method that can remove duplciated characters from a
string and returns the new value
"aaabbcccc" ===> "abc"

 */