package com.hillel.lecture_2;

public class Converters {
    public double CoefficientToInches (double meters) {
        double convertCoefficient = meters * 39.37;
        return convertCoefficient;
    }

    public double CoefficientToMeters (double inches) {
        double convertCoefficient = inches / 39.37;
        return convertCoefficient;
    }

    public double CoefficientToKilometers (double miles) {
        double convertCoefficient = miles*1.609;
        return convertCoefficient;
    }

    public double CoefficientToMiles (double kilometers) {
        double convertCoefficient = kilometers/1.609;
        return convertCoefficient;
    }

}
