package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {
    TemperatureMethods convertTemperature = new TemperatureMethods();

    @Step
    public double celsiusToFahrenheit(double celsius) {
//       TODO implements result Convert Celsius to Fahrenheit
        double result = convertTemperature.fahrenheitConvert(celsius);
        return result;
    }

    @Step
    public double fahrenheitToCelsius(double fahrenheit) {
//        TODO implements result convert Fahrenheit to Celsius
        double result = convertTemperature.celsiusConvert(fahrenheit);
        return result;
    }

    @Step
    public double celsiusToKelvin(double celsius) {
//        TODO implements result convert Celsius to Kelvin
        double result = convertTemperature.kelvinConvert(celsius);
        return result;
    }
}
