package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    WeightMethods convertWeight = new WeightMethods();

    @Step
    public double kilogramsToPounds(double kilograms) {
//        TODO implements result
        double result = convertWeight.pounds(kilograms);
        return result;
    }

    @Step
    public double poundsToKilograms(double pounds) {
//        TODO implements result
        double result = convertWeight.kilograms(pounds);
        return result;
    }

}
