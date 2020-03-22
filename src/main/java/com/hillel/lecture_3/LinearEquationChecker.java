package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    @Step
    public int linearEquation(int a, int b) {

//        TODO implements result
        int result = 0;

        if (a == 0 || b == 0) {
            result = 0;
            System.out.println("x = " + 0);
        } else if (a + b > 0) {
            result = -b / a;
            System.out.println("x = " + (-b / a));
        } else if (a + b < 0){
            result = b / a;
            System.out.println("x: " + (b / a));
        } else if (a + b == 0 || a - b == 0) {
            result = 0;
            System.out.println("Result: x = 0");
        }

        return result;
    }
}
