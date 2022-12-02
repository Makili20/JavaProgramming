package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //prints each integer of an integer array in separate lines
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }

    }

    //print each decimal number of double array
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }

    }

    //print each char of the char array
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }

    }

    //print each word form an String array
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }

    }
    //1. create a method that can return the max number from an integer
    //array

    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
    //returns the minimum number from integer array

    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //retruns the min number from double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array.returns boolean.contains(int[],int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is conatined in the given array.
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //check if the given char is contained in the given array
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }
    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array) {
            if( each.equals(element) ){
                result = true;
            }
        }

        return result;
    }

    //1.create a return method called addINTEGER that can add a
    //      integer after the last index of a Integer array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    // 2. create a return method called addDouble that can add a
    //        double after the last index of a double array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    //  3. create a return method called addString that can add a
    //        String after the last index of a String array

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        return result;
    }
    //  3. create a return method called addChar that can add a
    //        char after the last index of a char array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 11, 1, 1, 2, 2, 3, 3, 4, 4};
        int n = frequencyOfElement(arr, 1);
        System.out.println("n = " + n);
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;


    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;


    }

    //returns the frequency of ther given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }
    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[]array){
        double[] result={};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static int[] uniqueElements(int []array){
        int[] result={};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; //new int[0]

        for (char each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; //new int[0]

        for (String each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }
    //                              {1,2,3,4,3}         4
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index Number: "+index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if(i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }

        return result;
    }
    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //merges two given arrays and returns the new array
    public static int[] merge(int[] arr1,int[] arr2){
        int[] result={};
        for (int each : arr1) {
            result=addElement(result,each);
        }
        for (int each : arr2) {
            result=addElement(result,each);
        }
        return result;
}

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
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


    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
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

    public static int[] replaceAll(int[] array,int oldValue,int newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }


    public static double[] replaceAll(double[] array,double oldValue,double newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }

    public static char[] replaceAll(char[] array,char oldValue,char newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }


    public static String[] replaceAll(String[] array,String oldValue,String newValue){


        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }

        }
        return array;
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







