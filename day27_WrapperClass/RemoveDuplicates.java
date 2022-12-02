package day27_WrapperClass;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,2,2,33,3,3,3,44,4,4,4,4};
        arr=removeDUplicates(arr);
        System.out.println(Arrays.toString(arr));
        String[] words={"Java","Java","Python","C#","Java"};
        words=removeDUplicates(words);
        System.out.println(Arrays.toString(words));
        System.out.println("------------------");
        int[] numbers={1,1,1,1,1,1,2,2,2,2,3,3,3,33,4,4,4,4,4};
       numbers= Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] removeDUplicates(int[] array){
        int[] result={};

        for(int each:array) {
            if(!ArraysUtility.contains(result,each)){
              result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }
    public static double[] removeDUplicates(double[] array){
        double[] result={};

        for(double each:array) {
            if(!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }
    public static char[] removeDUplicates(char[] array){
        char[] result={};

        for(char each:array) {
            if(!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }
    //removes the duplicates from the given array, returns the new array
    public static String[] removeDUplicates(String[] array){

        String [] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }


}
