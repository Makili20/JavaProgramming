package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number=5;
        /*
        if(number==1){
        if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        System.out.println("-----------------------");



         */

switch(number){//1,2,3,4,5,6,7

    case 1:
        System.out.println("Monday");
    break;

    case 2:
        System.out.println("Tuesday");
        break;//exits the switch after executing the case block
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default://only gets executed if none of the case blocks are matching
        System.out.println("Invalid");
        break;//if the default block is at very end the break statement is optional



}







    }
}
