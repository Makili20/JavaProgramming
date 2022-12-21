package day43_Abstraction.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
      //  Car car1=new Car();

        Bmw bmw=new Bmw();
        Tesla tesla=new Tesla();
        Toyota toyota=new Toyota();
        Jeep jeep=new Jeep();

        bmw.start();
        tesla.start();
        toyota.start();
        jeep.start();

    }
}
