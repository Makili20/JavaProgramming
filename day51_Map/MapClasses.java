package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();//hashMap is the fastest but order is not garantee,it is random
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(30, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5,null);//keys can not be duplicated,the last one get printed
        hashMap.put(6,null);
        hashMap.put(null,"Cihad");
        hashMap.put(null,"EMre");//can only accept one null key and many null vallues

        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//always keeps the insertion order
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(30, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();//does not accept any null keys and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(30, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");

        System.out.println("treeMap = " + treeMap);

        Map<Integer, String> hashTable = new Hashtable<>();//does not accept null keys or values
        hashTable.put(10, "Arthur");
        hashTable.put(20, "George");
        hashTable.put(30, "Jack");
        hashTable.put(40, "Emma");
        hashTable.put(5, "Isabella");

        System.out.println("hashTable = " + hashTable);

    }
}
