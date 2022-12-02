package day09_IfStatements;

public class IfAndElse_Tasks {
    public static void main(String[] args) {
        int a= 35,
                b=55;
        if(a>b){
            System.out.println(a+" is the maximum number");}


        if(a>b){
            System.out.println(a+" is the maximum number");}
        else{
            System.out.println(b +" is the maximum number");}

        System.out.println("----------------");

        int age=21;
        if(age>=21){
            System.out.println("Is Eligible");}
        else{
            System.out.println("Is Not Eligible");}

        System.out.println("------------");

        int age1=21;
        String citizen="UK";

        boolean isEligible=age>18 && citizen=="USA";

        if(isEligible){
            System.out.println("Is Eligible to Vote");}
        else{
            System.out.println("Is Not Eligible to Vote");}







    }
}
/*task:
1. Maximum number between two different numbers
2. Minimum number between two different numbers
3. Write a progrm that can check if the person is
eligible to buy alcohol
4. Write a progrm that can check if the person is
eligible to vote
Task:
1. garde report ==> A, B, C, D, F
2. name of the month

 */