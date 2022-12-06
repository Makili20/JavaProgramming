package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
    Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 150000);
    Developer developer = new Developer("Korkmaz", 28, 'M', 1, "Java Developer", 200000);
    Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);
    Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);


        System.out.println("-------------------------");
        developer.setAge(35);
        System.out.println(developer.getAge());

        developer.work();
        teacher.work();
        tester.work();

        developer.eat();
        developer.sleep();

}}
/*
Create a class named Cydeo:
create objects of Tester, Developer,Teacher, Student
test all the functions of each objects
Analyze the relationships between the classes
 */