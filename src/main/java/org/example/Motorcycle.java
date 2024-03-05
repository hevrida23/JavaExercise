package org.example;

public class Motorcycle extends Vehicle {
    public String sideCar;
    public Motorcycle (String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }

    @Override
    public String vehicleSound() {
        return "Motorcycle ("+ this.brand + ", " + this.model + ", " + this.year + "): NGENGGG";
    }

}
