package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student("Ahmet");
        System.out.println(student1);
        Student student2=new Student("Aygun,'F");
        System.out.println(student2);

        Student student3=new Student("Nigara",11);
        Student student4=new Student("Mert",12,'A');
        Student student5=new Student("Cihad",'M',28);
        Student student6=new Student("Jacob",'M',23,34);
        Student student7=new Student("Moira",'F',35,13,'B');

        System.out.println(student1==student2);

        Student[] students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));




    }
}
