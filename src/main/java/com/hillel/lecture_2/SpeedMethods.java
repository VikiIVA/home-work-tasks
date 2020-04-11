package com.hillel.lecture_2;

public class SpeedMethods {
    public double speedMiles (double speedKm) {
        double miles = speedKm / 1.60926939169617;
        return miles;
    }

    public double speedKilometers (double speedMi) {
        double kilometers = speedMi*1.60926939169617;
        return kilometers;
    }
}
