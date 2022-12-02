package day34_GarbageCollection;

public class StaticMembers {

    class class1 {

    }

    public static int num = 100;

    public static void method() {

    }

    static {// Static can be class only if there is nested class and the inner class has the sttaic keyword

    }


}

class A {//outer class

    static class B {//inner class
            public static void method1(){

            }
    }
}

class C {
    public static void main(String[] args) {
        A.B.method1();
    }
}