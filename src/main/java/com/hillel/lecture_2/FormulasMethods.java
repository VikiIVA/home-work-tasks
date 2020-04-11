package com.hillel.lecture_2;

public class FormulasMethods {
    public double NineFormula (double x) {
        double nineFormula = 1.1 * Math.exp(-x) + Math.abs(Math.cos(Math.sqrt(Math.PI*x)))-0.375;
        return nineFormula;
    }

    public double TenFormula (double x) {
        double tenFormula = 0.33333333333333335 * Math.sqrt(Math.abs(Math.sin(x))) * Math.cbrt(Math.exp(0.12 * x));
        return tenFormula;
    }

    public double ElevenFormula (double x) {
        double elevenFormula = 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5 * x))) * (1 / (Math.cbrt(Math.pow(x,2)) + 0.1428571428571429));
        return elevenFormula;
    }

    public double TwelveFormula (double x) {
        double twelveFormula = Math.log(Math.sqrt(Math.abs(2-x)) + 1.2) * (1 / (2 + Math.exp(-x))) + Math.cbrt(2/x);
        return twelveFormula;
    }
    public double ThirteenFormula (double x) {
        double thirteenFormula = Math.pow(Math.exp(-2+x),0.2) * (1 / Math.sqrt(Math.pow(x, 2) + Math.pow(x, 4) + Math.log(Math.abs(x-3.14))));
        return thirteenFormula;
    }



}
