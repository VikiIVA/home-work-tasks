package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    public FormulasMethods useThisFormula = new FormulasMethods();

    @Step
    public double calculate9Formula(double x) {
        double result = useThisFormula.NineFormula(x);
//        TODO implement formula 9
        return result;
    }


    @Step
    public double calculate10Formula(double x) {
        double result = useThisFormula.TenFormula(x);
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = useThisFormula.ElevenFormula(x);
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = useThisFormula.TwelveFormula(x);
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = useThisFormula.ThirteenFormula(x);
//        TODO implement formula 13
        return result;
    }
}
