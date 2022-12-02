package day23_CustomMethods_Void;

public class CustomMethodPractice {
    //create a function that can print hello world 5 times

    public static void PrintWorld(){
        for(int i =0;i<5;i++){
            System.out.println("Hello World");
        }
    }
    // create a function that can print hello Cydeo 5 timees
    public static void PrintHello(){
        for(int i =0;i<5;i++){
            System.out.println("Hello Cydeo");
        }
    }



    public static void main(String[] args) {
       PrintWorld();
        System.out.println("---------------------");
        PrintHello();
        System.out.println("----------------------");
        EvenNumbers();
    }
    //create a function that can print all even numbers from1~10
    public static void EvenNumbers(){
        for(int i=1;i<11;i++){//second option:i+=2
            if(i%2==0){
                System.out.println(i);
            }
        }
        //creat a function that can print all the numbers between X and Y


    }
    //creat a function that can print all the numbers between X and Y

    public static void printNumbers(int x,int y){
        for(int i=x;i<y;i++){
            System.out.println(i);
        }
    }
}
