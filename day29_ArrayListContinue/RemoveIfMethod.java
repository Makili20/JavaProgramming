package day29_ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

      /*  for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                list.remove(i);
            }
        }
       */

        list.removeIf( p -> p%2!=0);
        System.out.println(list);
        list.removeIf(p-> p<5);//lambda expression
        System.out.println(list);
        System.out.println("------------------------");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(p-> p%2==0);
        System.out.println(list2);
        System.out.println("-----------------");
        ArrayList<String>list3=new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","Ruby","C#","Java","C++"));
        list3.removeIf(word-> word.startsWith("J"));
        System.out.println(list3);
        //remove all palindromes
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));
        names.removeIf(name-> StringUtility.isPalindrome(name));
        //  names.removeIf(name-> !StringUtility.isPalindrome(name));--->remove the ones that are not palindromes
        System.out.println(names);






    }
}
