package day43_Abstraction.employeeTask;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {
        Tester tester1=new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),"Tester",100000);
       // tester1.gender='F'; Can only read it,can not modify it
        //tester1.DOfB=LocalDate.of(2000,11,20);
        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);


        Developer developer1=new Developer("Virginia",'F',LocalDate.of(1973,11,20),"Developer",120000);

        System.out.println(developer1);
    }
}
/*
4. create a class called PenFed
			create 3 objects of Tester and Developers

			try to make change to the gender & DOfB of the employees

 */