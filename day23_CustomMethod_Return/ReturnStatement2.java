package day23_CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfMonth(9);
    }
    public static void nameOfMonth(int num) {
        if(num<1 || num>12){
            System.out.println("Invalid");
            return;
        }

      String name= (num == 1) ? "January" : (num == 2) ? "Feb" : (num == 3) ? "Mar" : (num == 4) ? "Apr" : (num == 5) ? "May"
                    : (num == 6) ? "Jun" : (num == 7) ? "July" : (num == 8) ? "Aug" : (num == 9) ? "Sep"
                    : (num == 10) ? "Oct" : (num == 11) ? "Nov" : "Dec";
        System.out.println("Month name: "+ name);

    }
}
//3. Create a method that can display the name of the month based on
//    //the given number to the method