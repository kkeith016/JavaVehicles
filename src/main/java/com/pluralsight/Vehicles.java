package com.pluralsight;

public class Vehicles {
    private String color;
    private int numberOfPassangers;
    private int cargoCapacity;
    private int fuelCapacity;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String toString() {
        return String.format("Color: %s%nPassengers: %d%nCargo Capacity: %d%nFuel Capacity: %d%n",
                color, numberOfPassangers, cargoCapacity, fuelCapacity);
    }
}
