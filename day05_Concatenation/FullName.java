package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Marijana";
        String lastName = "Igracki";
        int age = 35;
        String jobTitle = "SDET";
        String companyName = "AppleINC";
        double salary = 10000.57;
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println("Full name of the person is " + fullName + ".");
        System.out.println(fullName + " is " + age + " years old.");System.out.println(fullName + " is " + jobTitle + " , " + "works at " + companyName +
                ", and " +fullName +"'s salary is $"+salary);








    }





}
