package day30_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();

        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";

        Dog dog2=new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age=3;
        dog2.color="brown";
        dog2.gender='M';
        dog2.size="Large";

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",2,'M',"Large","Black");

        System.out.println(dog1);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);

        dog1.eat();
        dog2.bark();





    }
}
