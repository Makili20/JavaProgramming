package practiseTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day28_MultiplyOddNumber {
    public static void main(String[] args) {



        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        for (Integer each : list) {
           int each1=each*2;
            System.out.println(each1);

        }







    }
}
/*
3. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
 */