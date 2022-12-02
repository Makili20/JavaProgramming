package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethdoOverloadingIntro {

    public static void main(String[] args) {
        double[] intArray = {5, 6, 0 - 1, 3, 4};
        Arrays.sort(intArray);
        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);
        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);
        System.out.println("------------");
       int sum= sumOfNumbers(4,6);
        System.out.println(sum);
    }


    public static int sumOfNumbers(int num1,int num2) {
        return num1 + num2;
    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }
        public static int sumOfNumbers(int num1,int num2,int num3){
            return num1+num2+num3;
        }

        public static int sumOfNumbers(int num1,int num2,int num3,int num4){
            return num1+num2+num3+num4;
        }






}
