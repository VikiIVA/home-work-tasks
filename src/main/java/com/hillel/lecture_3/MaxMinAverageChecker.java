package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        if (b > a) {
            if (b > c) {
                result = b;
                System.out.println(b);
            } else {
                result = c;
                System.out.println(c);
            }
        } else if (a > c) {
            result = a;
            System.out.println(a);
        } else{
            result = c;
            System.out.println(c);
        }
        if (a == b && b == c) {
            result = 0;
            System.out.println(result);
        }


        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        if (((b < a) && (a < c)) || ((c < a) && (a < b))) {
            result = a;
            System.out.println(a);
        } else if (((a < b) && (b < c)) || ((c < b) && (b < a))) {
            result = b;
            System.out.println(b);
        } else if (((a < c) && (c < b)) || ((b < c) && (c < a))){
            result = c;
            System.out.println(c);
        }
        if (a == b && b == c) {
            result = 0;
            System.out.println(result);
        }

        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        if (a < b) {
            if (a < c) {
                result = a;
                System.out.println(a);
            } else {
                result = c;
                System.out.println(c);
            }

        } else if (b < c) {
            result = b;
            System.out.println(b);
        } else {
            result = c;
            System.out.println(c);
        }
        if (a == b && b == c) {
            result = 0;
            System.out.println(result);
        }

        return result;
    }
}
