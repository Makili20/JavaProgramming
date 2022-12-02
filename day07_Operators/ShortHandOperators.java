package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

       //assignment:=
       int number=100;
        System.out.println("number= " + number);//100

      number=200;
        System.out.println("number= "+ number);//200
        String word="Java Programming";
        System.out.println("word= " + word);
        word="Wooden Spoon";
        System.out.println("word= "+ word);
        //Addition assignment:
        int x = 100;
        System.out.println("x= " + x);
        System.out.println(x + 200);//300
        System.out.println("x= " + x);


       // x=x+200;
        System.out.println("x= " +x);
        x+=200;
        System.out.println("x= " + x);

        String str="Wooden";
        str+=" Spoon";
        System.out.println("str= "+ str);

double num1=2.5;
        System.out.println("num1= " + num1);//2.5
num1+=5.5;
        System.out.println("num1= " + num1);

        double avaliableBalance=1000.50;

        //deposit 300$


        System.out.println("avaliableBalance= " + avaliableBalance );//1300.5
avaliableBalance +=300;

        System.out.println("avaliableBalance= " + avaliableBalance);
        //withdrowing 500$

        avaliableBalance-=500;//avaliableBalance=1300.5-500;
        System.out.println("avaliableBalance= "+ avaliableBalance);

        //withdrawing 200$,then depositing 400$

        avaliableBalance-=200;//avaliableBalance=600.5;
        avaliableBalance+=400;//avaliable Blaance=1000.5;
        System.out.println("avaliableBalance= " + avaliableBalance);

        double salary=50000.50;
        salary *=2;
        System.out.println("salary= "+ salary);
   double dodge=0.00000001;
   dodge*=1000000;
        System.out.println("dodge= "+ dodge);

        double num2= 25000;
        num2/=2;
        System.out.println("num2= "+ num2);
        System.out.println("-----------------------");

        double num3=100;
        //%=

        num3%=3;
        System.out.println("num3= " + num3);

        int amount=127;//cents

        int quarters=amount/25;
        int cents=amount%25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2=127;
        cents2%=25;

        System.out.println("cents2 = " + cents2);

        int y=300;
       y%=16;
        System.out.println("y = " + y);
        int balance=3500;
        //insurance fee:$153

        balance%=153;
        System.out.println("balance = " + balance);






    }
}
