package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 15,
                c = 20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        //on order for a to be a median number:
        //1.if c is the maximum number & b is the minimum number,then a is the minimum number
        //2. if b is the maximum number & c is the minimum number,then a is the  median number
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {//if a is the median number
            System.out.println(a + " is the median number");

        }
        if (bIsMedian) {
            System.out.println(b + " is the median number");
        }

        if (cIsMedian) {
            System.out.println(c + " is the median number");
        }

    }
}
/*2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;
Output:
15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number

 */