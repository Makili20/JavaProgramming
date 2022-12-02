package day17_While_WhileDoLoop;

public class java {
    public static void main(String[] args) {
        String str="Java Java java java";
        int frequency=0;

        str=str.toLowerCase();

        while(str.contains("java")){
            str=str.replaceFirst("java"," ");
            frequency++;
        }


        System.out.println(frequency);
















    }
}
