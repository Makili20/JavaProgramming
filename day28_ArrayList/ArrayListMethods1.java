package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        //add method
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//3
        numbers.add(40);//4

        numbers.add(2,25);//index 2:25
        numbers.add(5,45);//5
        System.out.println(numbers);
        System.out.println(numbers.size());
            //size method
        int lastIndex=numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);
                //get method
        int num=numbers.get(3);

        System.out.println(num);
        System.out.println("---------------");

        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("-------------------------------------");
        //set method--->just replace the element at given index
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"javaScript");
        list.set(3,"C++");
        System.out.println(list);
        System.out.println("---------------");
            //remove method
        ArrayList<String>employees=new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Hulya");
        employees.add("Neira");
        employees.add("Kaloyan");
        employees.add("Ali");
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
       boolean r1= employees.remove("Neira");
        System.out.println(r1);
    }
}
