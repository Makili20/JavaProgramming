package day15_ForLoop;

public class ForLoopePractices {
    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//100~50
        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");//i:100,99,98.......50
        }
        System.out.println();
        System.out.println("------------------------");
        //print all the even number between 1~55
        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
        System.out.println("------------------");

        //print all the even numbers between 1~55:2,4,6.......54

        for (int i = 2; i <= 54; i += 2)// i:2,4,6,8......54
        {
            System.out.println(i + " ");
        }
           /*
             A~Z
             a~z
             Z ~A
             z~a
            */
        System.out.println("---------------");
        for( char i='A'; i <='Z'; i++){
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println("------------------");


        for( char i='a';i <='z'; i++){
            System.out.print(i + " ");
        }
        System.out.println("------------------");
        System.out.println("-----------");

        for(char i = 'Z';i >='A'; i--){
            System.out.print(i+ " ");

        }
        System.out.println();
        System.out.println("------------------");
        for(char i ='z'; i >='a';i--){
            System.out.print(i+" ");
        }


    }
}
