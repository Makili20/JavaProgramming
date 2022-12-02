package day21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40};
//                      0  1  2  3
        //{50,40,30,20,10}--> reversed array
        int[] reversed=new int[numbers.length];
        //to make sure that the array has enough cpacity to contain
        //all the elements of the first array
        //   j            i
        /*reversed[0]=numbers[numbers.length-1];
        reversed[1]=numbers[2];
        reversed[2]=numbers[3];
        */
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=numbers[i];
            
        }


        System.out.println(Arrays.toString(reversed));
















    }
}
