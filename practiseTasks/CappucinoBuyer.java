package practiseTasks;

public class CappucinoBuyer {
    public static void main(String[] args) {

        String size = "tall";
        double price = 0.0;
        int calories = 0;
        //switch(size){
        // case "Tall":
        //System.out.println("tall:\n" +
        // "price is $3.69\n" +
        // "90 calories\n");
        //  break;
        //  case"Grande":
        // System.out.println("grande:\n" +
        //  "price is $3.99;\n" +
        // "120 calories");
        //  break;
        // case "Venti":
        //  System.out.println("venti:\n" +
        //  "price is $4.29\n" +
        //  "150 calories");
        //break;
        // default: System.out.println("Incorrect username or password,please re-enter");
        //System.err.println("Invalid size: "+size);
        //}

        switch (size) {
            case "tall":
                price = 3.69;
                calories = 90;
                break;

            case "grande":
                price = 3.99;
                calories = 120;
                break;

            case "venti":
                price = 4.29;
                calories = 150;
                break;

            default:
                System.err.println("Invalid Size: " + size);
        }


        System.out.println("---------");
        if (price != 0) {
            System.out.println("Price is: $" + price);
            System.out.println(calories + " calories");
        }


    }
}


/*1. Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */