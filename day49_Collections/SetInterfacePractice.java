package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {


        Set<Integer> hashSet=new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));//random order,accept null values
        System.out.println(hashSet);




        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));//kkep the insertion order,accept null values
        System.out.println(linkedHashSet);

        Set<Integer> treeSet=new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));//mantains the sorted(Ascending )order,does not accept null
        System.out.println(treeSet);


    }



}
