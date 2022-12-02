package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city: ");
        String city = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your country name: ");
        String country=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("Building number= " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

        System.out.println(fullName +"\n"+ buildingNumber +"\n"+ streetName + "\n" + city +" "+ state + "\n"+ zipCode +"\n" + country);
        input.close();




    }
}
/*
1.Entyer your fulll name // nextLine()
2.Enter your building numbe //next()
3.Enter your street name //nextLine()
4.Enter your city name //nextLine()
5.Enter your state //next()
6.Enter your zip code//next()

Displaye the shipping address
 */