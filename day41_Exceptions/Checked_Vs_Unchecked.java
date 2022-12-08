package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_Vs_Unchecked {
    public static void main(String[] args) {


        //unchecked exception:

        int a = 10;
        int b = 0;

        //System.out.println(a/b);//without dealing with the exception,you will not be able to go to the next step

        char[] characters = {'A', 'B', 'C'};
        //  System.out.println(characters[99]);

        Student student = null;//object does not exist
        // System.out.println(student.getName());

        String str = "Wooden Spoon";//in order to call instances you have to have object
        str = null;
       // System.out.println(str.toUpperCase());



        //Checked exception:

        System.out.println("Hello");

      //  Thread.sleep(3);

        System.out.println("Cydeo");

       // FileInputStream file=new FileInputStream("path of the file");





    }
}
