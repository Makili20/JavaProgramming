package practiseTasks;

public class VoidMethd_DollarToEuro {

    public static void dollarToEuro(double dollarAmount){
        double euro = dollarAmount * 1.13;
        System.out.println(dollarAmount+" dollar is equal to "+euro+" euro");
    }

    public static void main(String[] args) {
        dollarToEuro(100);
    }
}
/*9. create a method that can convert dollar to euro

 */