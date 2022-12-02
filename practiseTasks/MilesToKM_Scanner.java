package practiseTasks;
import java.util.Scanner;

public class MilesToKM_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles=scan.nextDouble();
        scan.close();

double milesToKm= miles*1.6;

if(milesToKm==16.09){
    System.out.println(miles+" miles equal to 16.09 kilometars");
}




    }







}
/*
 Write a program that can convert Miles to KM
Ex:
Enter miles:
10.0
output:
10.0 miles equal to 16.09 kilometers
 */