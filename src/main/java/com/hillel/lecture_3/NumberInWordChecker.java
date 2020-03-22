package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberInWordChecker {

    @Step
    public String getNumberIfElse(int number) {
        //        TODO implements result
        String result = "";
        if (number==1) {
            result = "ONE";
            System.out.println("ONE");
        }
        else if (number ==2) {
            result = "TWO";
            System.out.println("TWO");
        }
        else if (number ==3) {
            result = "THREE";
            System.out.println("THREE");
        }
        else if (number ==4) {
            result = "FOUR";
            System.out.println("FOUR");
        }
        else if (number ==5) {
            result = "FIVE";
            System.out.println("FIVE");
        }
        else if (number ==6) {
            result = "SIX";
            System.out.println("SIX");
        }
        else if (number ==7) {
            result = "SEVEN";
            System.out.println("SEVEN");
        }
        else if (number ==8) {
            result = "EIGHT";
            System.out.println("EIGHT");
        }

        else if (number ==9) {
            result = "NINE";
            System.out.println("NINE");
        }
        else {
            result = "OTHER";
            System.out.println("OTHER");
        }

        return result;
    }

    @Step
    public String getNumberSwitchCase(int number) {
        //        TODO implements result
        String result = "";
        switch (number) {
            case 1:
                result = "ONE";
                System.out.println("ONE");
                break;
            case 2:
                result = "TWO";
                System.out.println("TWO");
                break;
            case 3:
                result = "THREE";
                System.out.println("THREE");
                break;
            case 4:
                result = "FOUR";
                System.out.println("FOUR");
                break;
            case 5:
                result = "FIVE";
                System.out.println("FIVE");
                break;
            case 6:
                result = "SIX";
                System.out.println("SIX");
                break;
            case 7:
                result = "SEVEN";
                System.out.println("SEVEN");
                break;
            case 8:
                result = "EIGHT";
                System.out.println("EIGHT");
                break;
            case 9:
                result = "NINE";
                System.out.println("NINE");
                break;
            default:
                result = "OTHER";
                System.out.println("OTHER");
                break;
        }

        return result;
    }
}
