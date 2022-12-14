package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
            //addAll Method
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,3,4,5,6,7));
        System.out.println(list);

        //removeAll Method

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        //retainAll Method
        System.out.println("-------------------");
        ArrayList<Integer>list1=new ArrayList<>();
        list.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        list.retainAll(Arrays.asList(100,200,300));
        System.out.println(list);

        System.out.println("---------------------");

        ArrayList<String>jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("------------------");
        //containsAll Method

        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,10));
        boolean r1=nums.contains(10);
        boolean r2=nums.containsAll(Arrays.asList(2,3,10));
        System.out.println(r1);
        System.out.println(r2);


        System.out.println("-----------------");

        String[] names={"Josh","Jack","Daniel","Shay","Breanna"};
        ArrayList<String>namesList=new ArrayList<>(Arrays.asList(names));

        System.out.println(namesList);
        /*
        ArrayList<String>namesList=new ArrayList<>();
        namesList.addAll(Arrays.asList("Josh","Jack","Daniel","Shay","Breanna"));
        System.out.println(namesList);
        */
        System.out.println("-------------------");
//you can not conver primitive arrays to arrayList with method
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer>list2=new ArrayList<>();
        System.out.println(list2);
        System.out.println("--------------------");
        int[] arr2={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3=new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println(list3);


    }
    //but you can create custom method
            public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer>list=new ArrayList<>();

                for (int each : array) {
                    list.add(each);
                }
                return list;
            }




}
