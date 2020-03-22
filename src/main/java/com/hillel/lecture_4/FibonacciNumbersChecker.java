package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                result[i] = i;
                continue;
            }

            if (i == 1 || i == 2) {
                result[i] = 1;
                continue;
            }

            result[i] = result[i - 1] + result[i - 2];

        }

        return result;
    }

}
