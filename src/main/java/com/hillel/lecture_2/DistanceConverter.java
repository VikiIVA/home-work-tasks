package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double result = 0.0;
        return (meters*39.37);
    }

    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result
        double result = 0.0;
        return (inches/39.37);
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = 0.0;
        return (miles*1.609);
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = 0.0;
        return (kilometres/1.609);
    }
}
