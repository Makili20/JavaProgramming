package day23_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        //find the max number between 100~200
       int maxNumber =max(100,200);
        System.out.println("maxNumber = " + maxNumber);


        //multiply the number by 2
       int multiplication= maxNumber*2;
        System.out.println("multiplication = " + multiplication);
    }

    public static int max(int a,int b){
        int result=0;

        if(a>b){
            result=1;
        }else{
            result=b;
        }
        return result;
    }








}
