package com.hillel.lecture_2;

public class TemperatureMethods {
    public double fahrenheitConvert (double celsius){
        double fahrenheit = (celsius*9/5)+32;
        return fahrenheit;
    }

    public double celsiusConvert (double fahrenheit){
        double celsius = (fahrenheit-32)*5/9;
        return celsius;
    }
    public double kelvinConvert (double celsius){
        double kelvin = (celsius-32)*5/9;
        return kelvin;
    }
}
