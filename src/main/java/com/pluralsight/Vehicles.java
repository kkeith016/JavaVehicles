package com.pluralsight;

public class Vehicles {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;


    public Vehicles(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return String.format(
                "Color: %s%nPassengers: %d%nCargo Capacity: %d%nFuel Capacity: %d%n",
                color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}