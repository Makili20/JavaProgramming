package day43_Abstraction.CarTask;

public abstract class Car {//can not be final

        public abstract void start();

}
 final class A {//can be final
 }
class B{
        public static void main(String[] args) {
                A obj1=new A();
               // Car obj2=new Car();can not create an object,Object MUST bew concrete


        }
}






/*
Car: abstract
		start();

	BMW
		start(): push start button

	Tesla
		start(): voice control

	Toyota
		start(): Insert the key

	Jeep
		start(): jump start

 */