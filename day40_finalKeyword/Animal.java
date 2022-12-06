package day40_finalKeyword;

public class Animal {

    private String name;
    final String breed;
    final private char gender;
    final String color;
    private String size;
    private int age;



   // public void setBreed(String breed){
      //  this.breed=breed;//you can only read final variable but you can not change it
    //after object is created you can not change the final variable
   // }

    public Animal(String breed, char gender, String color, String size, int age) {
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //------------Setters-----------------


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public final void drink(){
        System.out.println(name+" is drinking water");
    }















}
