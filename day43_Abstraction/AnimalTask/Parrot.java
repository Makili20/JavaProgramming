package day43_Abstraction.AnimalTask;

public final class Parrot extends Animal implements Playable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats chocolate");

    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
