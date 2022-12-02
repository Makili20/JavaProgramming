package practiseTasks;

import java.util.Scanner;

public class FrequencyOfG {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string and a char: ");
        String str=scan.nextLine();
        char ch=scan.nextLine().charAt(0);
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            char eachCh=str.charAt(i);
            if(eachCh=='m'){
                frequency++;
            }

        }


        System.out.println(frequency);









    }
    }

