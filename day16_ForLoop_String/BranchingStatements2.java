package day16_ForLoop_String;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------");
        //print all odd numbers 1~10(skip the even numbers)

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-----------------");

























    }
}
