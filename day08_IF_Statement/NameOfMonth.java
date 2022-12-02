package day08_IF_Statement;

public class NameOfMonth {
    public static void main(String[] args) {

        int number = 5;

        boolean monthIsJanuary = number==1;
        boolean monthIsFebruary = number==2;
        boolean monthIsMarch= number==3;
        boolean monthIsApril=number==4;
        boolean monthIsMay= number ==5;

        if(monthIsJanuary){

            System.out.println("Januray");
        }

        if(monthIsFebruary){
            System.out.println("February");
        }
        if(monthIsMarch){
            System.out.println("March");
        }
        if(monthIsApril){
            System.out.println("April");
        }
        if(monthIsMay){
            System.out.println("May");
        }
    }
}
