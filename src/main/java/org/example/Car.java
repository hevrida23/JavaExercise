package org.example;

public class Car extends Vehicle {
    public int numOfDoors;
    public Car (String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }

    @Override
    public String vehicleSound() {
        return "Car ("+ this.brand + ", " + this.model + ", " + this.year + "): bremmmm";
    }
}
