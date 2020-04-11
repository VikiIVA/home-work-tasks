package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    public Converters distanceConverter = new Converters();

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double result = distanceConverter.CoefficientToInches(meters);
        return result;
    }

    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result
        double result = distanceConverter.CoefficientToMeters(inches);
        return result;
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = distanceConverter.CoefficientToKilometers(miles);
        return result;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = distanceConverter.CoefficientToMiles(kilometres);
        return result;
    }
}
