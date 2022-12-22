package day43_Abstraction.AnimalTask;

public final class Cat extends Animal implements Playable{


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

    @Override
    public void play() {
        System.out.println(getName()+" is playing with ball");
    }
}
/*
Cat
					eat(): eats Biryani

 */