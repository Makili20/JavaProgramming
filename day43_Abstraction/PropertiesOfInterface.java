package day43_Abstraction;

public interface PropertiesOfInterface {

    int a=100;//static & final by default
    static int b=200;//final by default
    //it's impossible to achieve encapsulation in interface because in order to do encapsulation you need to have
    //private access modifier and in interface public is the only possible access modifier
    //it is meant to be inherited


    /*public PropertiesOfInterface(int a) {
        this.a = a;
    }

    /*static {
        b = 100;
    }


    public void methdod1(){
        System.out.println("Instance method");
    }

     */

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void methdos3();

    public default void method4(){//to create method with implementions in interface you need to give default specifier

        System.out.println("Default method");
    }


    class Test implements PropertiesOfInterface{
        @Override
        public void methdos3() {

        }
    }
}
