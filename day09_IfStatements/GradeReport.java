package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score= 75;

        boolean a= score>=90 && score<=100;
        boolean b= score >=80 &&!a;
        boolean c =score >=70 && !a && !b;
        boolean d= score >=60 && !c;
        boolean f= score >=0 && score<=59;

        String Grade;

        if(a){
            Grade="Excellent";}
            else if(b){
                Grade="Great";}
            else if(c){
                Grade="Good";}
            else if(d){
                Grade="Passed";}
            else{
                Grade="Failed";}
        System.out.println(Grade);
            }
        }









/*Task:
1. garde report ==> A, B, C, D, F

 */