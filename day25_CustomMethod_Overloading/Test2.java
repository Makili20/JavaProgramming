package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEach(arr1);

        System.out.println("--------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEach(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEach(arr3);

        System.out.println("--------------------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEach(names);


        System.out.println("--------------------------------");
        int[] n1={1,2,3,4,5,6};
        int max1=ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);
        System.out.println("-------------");
        double[] n2={2.3,4.5,6.6,7.8,20.5};
        double max2=ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);
        System.out.println("---------------");
       int[] a1={1,2,3,4,5,6,7};
      boolean r1= ArraysUtility.contains(a1,5);
        System.out.println(r1);
        System.out.println("----------");
        double[] a2={3.5,2.5,5.5,6.6};
        boolean r2=ArraysUtility.contains(a2,6.5);
        System.out.println("r2 = " + r2);
        System.out.println("-----------");
        char[] a3={'A', 'B', 'C', 'D'};
        boolean r3=ArraysUtility.contains(a3,'C');
        System.out.println("r3 = " + r3);


    }
}
