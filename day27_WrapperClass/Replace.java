package day27_WrapperClass;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};

       array= replace(array,2,30);
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------");
        String[] arr2={"Java","Python","C++","Ruby"};
       arr2= replace(arr2,2,"C#");
        System.out.println(Arrays.toString(arr2));
    }
    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array,int index,int newElement){

        if(index<0 || index> array.length-1){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static double[] replace(double [] array,int index,double newElement){

        if(index<0 || index> array.length-1){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static char[] replace(char [] array,int index,char newElement){

        if(index<0 || index> array.length-1){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static String[] replace(String [] array,int index,String newElement){

        if(index<0 || index> array.length-1){
            System.out.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }



}
/*warmup tasks:
1. Replace Task:
1.1 Create a method named replace that passes three
parameters: integer array, integer index, integer newElement. The method
replaces the element of the array at given index with the new element, and
returns the new array.
Ex:
arr = {1,2,3,4,5};
replace(arr, 2, 30) ===> {1,
2, 30, 4, 5}

 */