package day08_IF_Statement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 101;
        boolean evenNumber =number%2 ==0;
boolean oddNumber = !evenNumber;

      if(evenNumber){ //false

          System.out.println(number+ " is even number");

}

if(oddNumber){ //true
    System.out.println(number + " is odd number");
}
        System.out.println("-------------------");

int n = 200;
         //positive

        if (n > 0) { //if the n is greater than zero,then it's positive
            System.out.println(n+" is positive");
        }
        //negative
        if (n < 0){ // if n is less than 0,then is negative
            System.out.println(n+" is negative");
        }
        //zero
        if(n==0){ //if n is equal to zero
            System.out.println(n+ " is zero");
        }
        
        






/*
        System.out.println("Odd Number");
        System.out.println("Even Number");

 */






    }






}
