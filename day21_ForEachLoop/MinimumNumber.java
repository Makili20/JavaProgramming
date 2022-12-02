package day21_ForEachLoop;

public class MinimumNumber {
    public static void main(String[] args) {

        int[] numbers={3,56,24,8,9,2,45};
        int min=numbers[0];

        for (int number : numbers) {
            if(number<min){
                min=number;
            }

        }
        System.out.println(min);













    }
}
