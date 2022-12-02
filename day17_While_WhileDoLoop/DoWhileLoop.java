package day17_While_WhileDoLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean a = false;


        for (int i = 0; a; ) {
            System.out.println("Wooden Spooon-for loop");
        }

        System.out.println("--------------------");
        while (a) {
            System.out.println("Wooden Spoon-while loop");
        }
        System.out.println("------------");

        do {
            System.out.println("Wooden Spoon-do while loop");
        } while (a);


    }
}
