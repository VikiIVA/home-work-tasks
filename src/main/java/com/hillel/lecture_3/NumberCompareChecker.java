package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberCompareChecker {

    @Step
    public String getGreatestNumber(int a, int b) {

//        TODO implements result
        String result = "";

        if (a > b) {
            result = "Number " + a + " has greatest value!";
            System.out.println("Number " + a + " has greatest value!");
        }
        else if (b > a) {
            result = "Number " + b + " has greatest value!";
            System.out.println("Number " + b + " has greatest value!");
        }
        else {
            result = "Numbers " + a + " and " + b + " are equals!";
            System.out.println("Numbers 19 and 19 are equals!");
        }

        return result;
    }
}
