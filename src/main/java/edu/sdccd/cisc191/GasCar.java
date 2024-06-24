package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible {
    private int fuelLevel;

    public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        fuelLevel = 0;

    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void tankUp() {
        fuelLevel = 100;
    }
}
