package practiseTasks;

public class VoidMethod_PrntChar {

    public static void eachCharacter(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
    /*14. create a method named printEachElement that can print each
elements of an integer array
*/
   public static void eachElement(int[] numbers) {

        for (int number : numbers) {
            System.out.println(number);
        }

    }



    public static void main(String[] args) {
        eachCharacter("Maka");

    }
}
/*13. create a method named printEachChar that can print each
characters of a string

 */