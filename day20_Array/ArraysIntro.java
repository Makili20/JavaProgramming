package day20_Array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names

        String[] myGroup=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulyia";
        myGroup[4]="Mikael";
      //  System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup));//"Gunay","Neira","Suat","Hulya","Mikael"


        System.out.println("-----------------------------");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index:          1         2          3            4       5          6        7
        System.out.println(Arrays.toString(days));

        int number=5;
        if(number<1 || number>7){
            System.out.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

        System.out.println("--------------------");

        String[] months={"January","February","March","April","May","June","July","August",
        "September","October","November","December"};
        System.out.println(Arrays.toString(months));
        int num=6;
        if(num<1 || num>12){
            System.out.println("Invalid month");
            System.exit(0);
        }

        System.out.println(months[num-1]);


































































    }
}
