package day34_GarbageCollection;

import static day34_GarbageCollection.Circle.*;


public class StaticImport {
    //import static packageName.className.staticMember;--> imports one static member of a class
    //import static packageName.*;-->imports all static members of a class

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);
    }
}
