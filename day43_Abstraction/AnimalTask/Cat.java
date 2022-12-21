package day43_Abstraction.AnimalTask;

public final class Cat extends Animal{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
   public void Meow(){
       System.out.println(getName()+" is Meowing");
   }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Byriani");

    }
}
/*
Cat
					eat(): eats Biryani

 */