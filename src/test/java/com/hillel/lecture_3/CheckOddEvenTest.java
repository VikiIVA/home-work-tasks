package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу с названием “CheckOddEven”, которая печатает “Odd Number” если
 * переменная “number” типа int нечетная. Или “Even Number” если переменная четная.
 * Программа всегда должна перед выходом печатать “BYE”
 */

public class CheckOddEvenTest {

    private OddEvenChecker oddEvenChecker = new OddEvenChecker();

    @Test
    public void checkEvenTest() {
        int number = 352780;
        if(number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
//        assertEquals(oddEvenChecker.checkNumber(number), "Even Number");
    }

    @Test
    public void checkOddTest() {
        int number = 2342345;
        if(number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
//        assertEquals(oddEvenChecker.checkNumber(number), "Odd Number");
    }
}
