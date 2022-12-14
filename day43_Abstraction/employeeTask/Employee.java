package day43_Abstraction.employeeTask;

import java.time.LocalDate;

public class Employee {

    public String name;
    final  public char gender;
    final public LocalDate DOfB;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate DOfB,String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.salary = salary;
    }
public String toString(){
        return "Name: "+name+", Gender: "+gender+", DOfB: "+DOfB+", Job Title: "+
                jobTitle+", Salary $"+salary;
}


}
/*
Warmup task:
	1.create a class named Employee (meant to be super class):
			Attributes:
					name, gender(final), DOfB(final), jobTitle, Salary

					create constructor that can initialize lal those attributes
						(even final variable you should initialize them within constructor)
 */