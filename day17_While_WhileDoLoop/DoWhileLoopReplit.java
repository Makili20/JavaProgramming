package day17_While_WhileDoLoop;
import java.util.Scanner;
public class DoWhileLoopReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //!5=5*4*3*2*1;
        long result =1L;
        //5
        //result=result*5
        //result=result*4
        //result=result*3
        //result=result*2
        //result=result*1
        for(int i=n ;n>=1 ;n--){
            result= result * n ;
        }
        System.out.println(result);






















    }
}
