package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1);

        Employee employee2 = new Employee("Yulia", 'F');
        System.out.println(employee2);

        Employee employee3 = new Employee("Olga", 'F', "SDET");
        System.out.println(employee3);

        Employee employee4 = new Employee("Ozruk", 'M', "QA", 100000);
        System.out.println(employee4);



} }

