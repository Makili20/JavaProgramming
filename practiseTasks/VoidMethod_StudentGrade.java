package practiseTasks;

public class VoidMethod_StudentGrade {

    public static void StudentGrade(int score){
        if(score>=90 && score <=100){
            System.out.println("A");
        }else if(score>=75){
            System.out.println("B");
        }else if(score>=65){
            System.out.println("C");
        } else if (score >= 55) {

            System.out.println("D");
        } else if (score >= 45) {
            System.out.println("F");
        }else{
            System.out.println("Student did not pass the test");
        }
    }

    public static void main(String[] args) {
        StudentGrade(34);
    }




}
/*5. create a method that can calculate the grade of the student based
on the score

 */