package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculatorScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        double hourlyRate=scan.nextDouble();
        scan.nextLine();
        System.out.println("How many hours are you working in a week? ");
        int hours= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter state tax: ");
        double stateRate= scan.nextDouble()/100;
        scan.nextLine();
        System.out.println("Enter federal tax: ");
       double federalRate=scan.nextDouble()/100;
        scan.nextLine();
        double salaryBeforeTax= hourlyRate * hours * 52;
        double stateTax = salaryBeforeTax * stateRate / 100;
        double federalTax = salaryBeforeTax * federalRate /100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
scan.close();

    }
}
/* 3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome


 */