package day21_ForEachLoop;

public class SumOfNmbers {
    public static void main(String[] args) {
        int[] numbers={4,6,32,7,2};
        double sum=numbers[0];

        for (int number : numbers) {
            sum+=number;

        }
        double averageNum=sum/ numbers.length;
        System.out.println(averageNum);






    }
}
