package practiseTasks;

public class VoidMethod_day23 {

    /*1. create a method that can print odd numbers between 1~100 in a
    same line saperated by space

     */

    public static void OddNumber(){
        for(int i=1;i<=100;i++){
            if(!(i%2==0)){
                System.out.print(i+" ");
            }
        }
    }
/*create a method that can print even numbers between 1~100 in a
    same line saperated by space

 */
    public static void EvenNumbers(){
        for(int i=2;i<=100;i+=2){
                System.out.print(i+" ");
            }
        }
/*3. create a method that can check if a person is eligible to buy
alcohol

 */
    public static void isEligible(int age){
        if(age>=21){
            System.out.println("The person is eligible to buy alchohol!");
        }
    }

    public static void main(String[] args) {
        OddNumber();
        System.out.println();
        System.out.println("----------------");
        EvenNumbers();
        System.out.println();
        System.out.println("-----------------");
        isEligible(34);
    }




}
