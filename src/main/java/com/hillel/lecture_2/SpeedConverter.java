package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {
    SpeedMethods speedConvert = new SpeedMethods();

    @Step
    public double speedKmToMi(double speedKm) {
//        TODO implements result
        double result = speedConvert.speedMiles(speedKm);
        return result;
    }

    @Step
    public double speedMiToKm(double speedMi) {
//        TODO implements result
        double result = speedConvert.speedKilometers(speedMi);
        return result;
    }

}
