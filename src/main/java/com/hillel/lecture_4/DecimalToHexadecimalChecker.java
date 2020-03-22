package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";
        int decimal;
        char a []={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (value > 0) {
            decimal = value % 16;
            result = a [decimal] + result;
            value = value / 16;
        }
        System.out.println(result);
        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;
        int a = value.length();
        int b = 1;

        for (int i = a - 1; i >= 0; i--) {
            if (value.charAt(i) >= '0' && value.charAt(i) <= '9') {
                result += (value.charAt(i) - 48)*b;
                b = b * 16;
            } else if (value.charAt(i) >= 'A' && value.charAt(i) <= 'F') {
                result += (value.charAt(i) - 55)*b;
                b = b*16;
            }
        }
        System.out.println(result);
        return result;
    }
}
