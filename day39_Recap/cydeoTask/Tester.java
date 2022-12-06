package day39_Recap.cydeoTask;

import javax.xml.namespace.QName;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" create a ticket");
    }

    public void work() {
        super.work();
    }
}
/*
 Create a sub class of Employee named Tester
Override the work method
Extra methods:
createTicket()
 */