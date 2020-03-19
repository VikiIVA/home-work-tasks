package com.hillel.lecture_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”,
 * …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или любой
 * другой. Решить задачу двумя способами:
 * 1) с использованием if..else if
 * 2) с использованием switch-case
 */

public class PrintNumberInWordTest {

    private NumberInWordChecker numberInWordChecker= new NumberInWordChecker();

    @Test(dataProvider = "numberProvider")
    public void checkTestInIfElse(int number, String stringNumber) {
        if (number==1) {
            System.out.println("ONE");
        }
        else if (number ==2) {
            System.out.println("TWO");
        }
        else if (number ==3) {
            System.out.println("THREE");
        }
        else if (number ==4) {
            System.out.println("FOUR");
        }
        else if (number ==5) {
            System.out.println("FIVE");
        }
        else if (number ==6) {
            System.out.println("SIX");
        }
        else if (number ==7) {
            System.out.println("SEVEN");
        }
        else if (number ==8) {
            System.out.println("EIGHT");
        }
        else {
            System.out.println("OTHER");
        }
//        assertEquals(numberInWordChecker.getNumberIfElse(number), stringNumber) ;
    }

    @Test(dataProvider = "numberProvider")
    public void checkInSwitchCase(int number, String stringNumber) {
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
//        assertEquals(numberInWordChecker.getNumberSwitchCase(number), stringNumber) ;
    }

    @DataProvider(name = "numberProvider")
    public static Object[][] numberProvider() {
        return new Object[][] {
                { 1, "ONE" },
                { 2, "TWO" },
                { 3, "THREE" },
                { 4, "FOUR" },
                { 5, "FIVE" },
                { 6, "SIX" },
                { 7, "SEVEN" },
                { 8, "EIGHT" },
                { 9, "NINE" },
                { 100, "OTHER" },
        };
    }
}
