package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create each type of vehicle using the constructors
        Moped slowRide = new Moped("Red", 1, 10, 5);
        Car familyCar = new Car("Blue", 5, 400, 15);
        SemiTruck bigRig = new SemiTruck("White", 2, 20000, 300);
        Hovercraft airSkimmer = new Hovercraft("Silver", 8, 1200, 80);

        // Print out each vehicle's details
        System.out.println("=== Moped ===");
        System.out.println(slowRide);

        System.out.println("=== Car ===");
        System.out.println(familyCar);

        System.out.println("=== SemiTruck ===");
        System.out.println(bigRig);

        System.out.println("=== Hovercraft ===");
        System.out.println(airSkimmer);
    }
}
