package day26_CustomMethodPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeElements2 {
    public static void main(String[] args) {
        int[] arr1={4,2,3,5,6,};
        int[] arr2={7,8,9,3};
        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------");

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"D", "E", "F"};

        String[] result = merge(a1, a2);

        System.out.println(Arrays.toString(result));


    }
   public static int[] merge(int[] arr1,int[] arr2){
       int[] result={};

       for (int each : arr1) {
         result= ArraysUtility.addElement(result,each);

       }
       for (int each : arr1) {
           result= ArraysUtility.addElement(result,each);

       }
       return result;
   }
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }
}
