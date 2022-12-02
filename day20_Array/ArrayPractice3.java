package day20_Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice3 {
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length=scan.nextInt();//10

        if(length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[]numbers=new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
           numbers[i] =scan.nextInt();// each input user provided during execution of the loop
            //will be asigned to the indexes of array
        }


        System.out.println(Arrays.toString(numbers));

        scan.close();




















    }
}
