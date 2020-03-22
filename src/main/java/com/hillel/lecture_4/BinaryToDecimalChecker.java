package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public  int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        int i;
        int a;
        for (a = 1; value !=0; a = a * 10) {
        i = value % 2;
        value /= 2;
        result += i * a;
    }
        System.out.println(result);
        return result;
   }



    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        int n = 0;
        while (true)
        if (value == 0) {
            break;
        } else {
            int a = value % 10;
            result += a * Math.pow(2, n);
            value = value / 10;
            n++;
        }
        System.out.println(result);

        return result;
    }
}
