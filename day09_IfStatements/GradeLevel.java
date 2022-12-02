package day09_IfStatements;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade=9;
        String level;
        boolean a= grade>=1 && grade<=5;
        boolean b= !a && grade<=8;
        boolean c= grade>=9 && grade<=12;
        boolean d= grade>=13 && grade <=16;
        boolean f=grade>=17 && grade<=18;


        if(a){
            level="Elementary";}
        else if(b){
            level="Middle";}
        else if(c){
            level="High";
        }
        else if(d){
            level="College";
        }
        else{
            level="Grad";}
        System.out.println(level);










    }
}
/*2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18


 */