package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int n = 5;
        String name = (n == 1) ? "January" : (n == 2) ? "February" : (n == 3) ? "March" :
                (n == 4) ? "April" : (n == 5) ? "May" : (n == 6) ? "June" : (n == 7) ? "July"
                        : (n == 8) ? "August" : (n == 9) ? "Sep" : (n == 10) ? "Oct"
                        : (n == 11) ? "Nov" : "Dec";
//you can exlude printaces(they are optional in ternaries,but is better to use it
        System.out.println(name);
    }
}
