package practiseTasks;

import java.util.Scanner;

public class StockMarket_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares you have?");
        int totalShares = scan.nextInt();
        String result = "Invalid number of shares";

        if (totalShares > 0) {
            System.out.println("How much is your total value in the stock market?");
            double totalValue = scan.nextDouble();

            scan.nextLine();
            System.out.println("Enter the name of the company that you have the most shares in");
            String companyName = scan.nextLine();
            scan.close();
            result = "Your total stock market holding is $" + totalValue + " which is made up of " + totalShares + " shares . "
                    + companyName + " is your company holdings.";


        }
        System.out.println(result);

    }
}
/*7. StockMarket task:
- Ask the user how many total shares they have already? (int)
-> If the user gives 0 or give a negative number none of the
rest condition should be executed
- Ask the user how much their total value in the stock market is
(double)
- Ask the user to enter the name of the company they have the
most shares in (String, multiple words)
- Print in the following format:
Ex:
inputs: 100, 25000, Apple INC
"Your total stock market holding is $25000 which is made up of
100 shares. Apple INC is your company holdings"
 */