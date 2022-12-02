package day20_Array;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};//stand for each element of array

        for (int j = 0; j < words.length; j++) {

            String element = words[j]; //in order to find unique element we need to find frequency of each el
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {//this loop is for finding the frequency
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element);
            }
        }





















    }
}
