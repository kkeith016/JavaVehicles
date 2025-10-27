package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(50);
        slowRide.setNumberOfPassangers(1);
        slowRide.setCargoCapacity(15);

        Car familyCar = new Car();
        familyCar.setColor("Silver");
        familyCar.setFuelCapacity(500);
        familyCar.setNumberOfPassangers(8);
        familyCar.setCargoCapacity(500);


    }
}
