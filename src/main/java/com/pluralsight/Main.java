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

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Red");
        bigRig.setFuelCapacity(1000);
        bigRig.setNumberOfPassangers(4);
        bigRig.setCargoCapacity(10000);

        Hovercraft airSkimmer = new Hovercraft();
        airSkimmer.setColor("Military Green");
        airSkimmer.setFuelCapacity(10000);
        airSkimmer.setNumberOfPassangers(400);
        airSkimmer.setCargoCapacity(100000);

        //Printing

        System.out.println("Moped: " + slowRide);
        System.out.println("Car: " + familyCar);
        System.out.println("SemiTruck: " + bigRig);
        System.out.println("Hovercraft: " + airSkimmer);

        System.out.println("The moped's fuel capacity is " + slowRide.getFuelCapacity() + " Gallons.");
    }
}
