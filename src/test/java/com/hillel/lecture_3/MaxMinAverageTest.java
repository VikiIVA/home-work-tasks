package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Даны три различных числа. Определить, какое из них (первое, второе или третье)
 * самое большое
 * самое маленькое
 * является средним
 */

public class MaxMinAverageTest {

    private MaxMinAverageChecker maxMinAverageChecker = new MaxMinAverageChecker();

    @Test
    public void checkMaxNumber() {
        int a = 0;
        int b = 5;
        int c = 10;

        if (b > a) {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (a > c) {
            System.out.println(a);
        } else{
            System.out.println(c);
        }
//        assertEquals(maxMinAverageChecker.getMaxNumber(a, b, c), c);
    }

    @Test
    public void checkAverageNumber() {
        int a = 0;
        int b = 5;
        int c = 10;
        if (((b < a) && (a < c)) || ((c < a) && (a < b))) {
            System.out.println(a);
        } else if (((a < b) && (b < c)) || ((c < b) && (b < a))) {
            System.out.println(b);
        } else if (((a < c) && (c < b)) || ((b < c) && (c < a))){
            System.out.println(c);
        }
//        assertEquals(maxMinAverageChecker.getAverageNumber(a, b, c), b);
    }

    @Test
    public void checkMinNumber() {
        int a = 0;
        int b = 5;
        int c = 10;

        if (a < b) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

//        assertEquals(maxMinAverageChecker.getMinNumber(a, b, c), a);
    }

    @Test
    public void checkThanAllNumberShouldNotBeEquals() {
        int a = 9;
        int b = 9;
        int c = 9;
        if (b > a) {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (a > c) {
            System.out.println(a);
        } else if (a < c) {
            System.out.println(c);
        } else if (((b < a) && (a < c)) || ((c < a) && (a < b))) {
            System.out.println(a);
        } else if (((a < b) && (b < c)) || ((c < b) && (b < a))) {
            System.out.println(b);
        } else if (((a < c) && (c < b)) || ((b < c) && (c < a))){
            System.out.println(c);
        } else if (a < b) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }


//        assertEquals(maxMinAverageChecker.getMaxNumber(a, b, c), 0);
//        assertEquals(maxMinAverageChecker.getAverageNumber(a, b, c), 0);
//        assertEquals(maxMinAverageChecker.getMinNumber(a, b, c), 0);
    }

}
