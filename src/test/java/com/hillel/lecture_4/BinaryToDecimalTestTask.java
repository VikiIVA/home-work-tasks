package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая перевод десятичные числа в двоичные и наоборот.
 */
public class BinaryToDecimalTestTask {

    private BinaryToDecimalChecker binaryToDecimalChecker = new BinaryToDecimalChecker();

    @Test
    public void fromDecimalToBinaryTest() {
        int expectedResult = 1010011010;
        int b = 0;
        int decimal = 0;
        while (expectedResult !=0) {
            int a = expectedResult % 10;
            decimal = decimal + (int)(a * Math.pow(2, b));
            b++;
            expectedResult = expectedResult / 10;
        }
        System.out.println(decimal);


//        assertEquals(binaryToDecimalChecker.fromDecimalToBinary(666), expectedResult) ;
    }

    @Test
    public void fromBinaryToDecimalTest() {
        int expectedResult = 777;
        String b = "";
        int n = expectedResult;
        while (n > 0) {
            int a = n % 2;
                n = n / 2;
                b = a + b;
            }
        System.out.println(b);
        }

//        assertEquals(binaryToDecimalChecker.fromBinaryToDecimal(1100001001), expectedResult) ;
    }

