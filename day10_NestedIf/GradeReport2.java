package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        /*
        80~100:Excellent
        80~89:Great
        70~79:Good
        60~69:Passed
        0~59:Failed
         */

        int s = 101;
        String result = "";
        if (s >= 0 && s <= 100) {
            //5 possibilities:A,B,C,D,F
            if (s >= 90) {//false:s<90
                System.out.println("Excellent");
            } else if (s >= 80) {//false:s<80
                System.out.println("Great");
            } else if (s >= 70) {//false:s <70
                System.out.println("Good");
            } else if (s >= 600) {//false:s <60
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {//if the s is NOT valdi
            System.out.println("Invalid s");
        }
        System.out.println("----------------");

        System.out.println(result);
//soulton2:Use ternaries only

        String result2 = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                : (s >= 60) ? "Passed" : "Failed" : "Invalid s";
        System.out.println(result2);

        System.out.println("-------------");

        //solution3:

        String result3 = "";

        if (s >= 0 && s <= 100) {// if the s is valid
            result3 = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                    : (s >= 60) ? "Passed" : "Failed" : "Invalid s";
        } else {//if the s is not Valid Score
            result3 = "Invalid Score";
        }

        System.out.println(result3);
    }
}
