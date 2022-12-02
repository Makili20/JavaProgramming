package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

    //    OddOrEven();//the method demaind additional info to complete its task

        OddOrEven(5);
        displayAge(1988);
        printNumbers(20,50);
    }



    //creat a function that can check if a number id odd number or even number

    public static void OddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");

        }
    }
   // create a function that can display the age of the person

    public static void displayAge(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is: "+age);
    }

    //creat a function that can print all the numbers between X and Y

    public static void printNumbers(int x,int y){
        for(int i=x;i<y;i++){
            System.out.println(i);
        }
    }




}
