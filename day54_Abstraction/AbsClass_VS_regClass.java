package day54_Abstraction;
class A{//can create object from it
    //can be final
    int a=10;
    static int b=20;

    public void method1(){
    }
    public void method2(){
    }
    static{

    }
    public A(){

    }

   // public abstract void method3() {
    }

   abstract class B{//you can not create object from it
    //can not be final
       int a=10;
       static int b=20;

       public void method1(){
       }
       public void method2(){
       }
       static{

       }
       public B(){

       }
   }




public class AbsClass_VS_regClass {
}
