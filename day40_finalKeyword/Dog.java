package day40_finalKeyword;

public class Dog extends Animal{


    public Dog(String breed, char gender, String color, String size, int age) {
        super(breed, gender, color, size, age);
    }

    public void eat() {
        System.out.println(getName()+" is eating dog food");

    }
//public final void drink(){// final methods can not be overriding

}






//eating dog food
