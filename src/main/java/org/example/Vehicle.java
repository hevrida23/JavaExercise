package org.example;

import java.util.Calendar;


public class Vehicle {
   public String brand;
   public String model;
   public int year;



   public Vehicle (String brand, String model, int year) throws InvalidYearException {
       //check validasi year kondisi year input < tahun sekarang
       Calendar cal = Calendar.getInstance();
       int tahunSekarang = cal.get(Calendar.YEAR);
          if (year > tahunSekarang) {
              throw new InvalidYearException("Year input harus lebih kecil dari tahun sekarang");
          }

       this.brand = brand;
       this.model = model;
       this.year = year;
   }

    public String vehicleSound(){
       return "Vehicle ("+ this.brand + ", " + this.model + ", " + this.year + "): brekbrekbrek ";
    }
}
