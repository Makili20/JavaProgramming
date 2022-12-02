package practiseTasks;

public class FrequencyOfDogAndCat {
    public static void main(String[] args) {

        String str = "cat DoG Dog CAt";
        int countDog = 0;
        int countCat = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String s = str.substring(i, i + 3);
            if (s.equalsIgnoreCase("dog")) {
                countDog++;
            }
            if (s.equalsIgnoreCase("cat")) {
                countCat++;
            }

        }

      boolean result=countCat==countDog;
        System.out.println(result);
    }}
/*
 write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */