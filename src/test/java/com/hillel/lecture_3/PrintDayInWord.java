package com.hillel.lecture_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу с названием “PrintDayInWord”, которая печатает “Sunday”, “Monday”,
 * …. “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 … 7. В противном случае
 * программа должна вывести “Not a valid day”. Решить задачу двумя способами:
 * 1) с использованием if..else if
 * 2) с использованием switch-case
 */

public class PrintDayInWord {

    private DayInWordChecker dayInWordChecker = new DayInWordChecker();

    @Test(dataProvider = "daysProvider")
    public void checkTestInIfElse(int number, String day) {
        if (number ==1) {
            System.out.println("Monday");
        }
        else if (number ==2) {
            System.out.println("Tuesday");
        }
        else if (number ==3) {
            System.out.println("Wednesday");
        }
        else if (number ==4) {
            System.out.println("Thursday");
        }
        else if (number ==5) {
            System.out.println("Friday");
        }
        else if (number ==6) {
            System.out.println("Saturday");
        }
        else if (number ==7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Not a valid day");
        }
//        assertEquals(dayInWordChecker.getDayIfElse(number), day);

    }


    @Test(dataProvider = "daysProvider")
    public void checkInSwitchCase(int number, String day) {
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
                break;

        }
//        assertEquals(dayInWordChecker.getDaySwitchCase(number), day) ;
    }

    @DataProvider(name = "daysProvider")
    public static Object[][] daysProvider() {
        return new Object[][] {
                { 1, "Monday" },
                { 2, "Tuesday" },
                { 3, "Wednesday" },
                { 4, "Thursday" },
                { 5, "Friday" },
                { 6, "Saturday" },
                { 7, "Sunday" },
                { 8, "Not a valid day" },
        };
    }

}
