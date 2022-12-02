package day17_While_WhileDoLoop;
import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me? ");
        String answer= scan.next().toLowerCase();
        while(!(answer.equals("yes") || answer.equals("No"))){
            System.err.println("Invalid answer,Please re-enter");
            answer=scan.next().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println( "Congrats!");
        }else {
            System.out.println("Goodbye!");
        }



















    }
}
