package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        if (Math. sqrt(circleArea / Math.PI) <= (Math.sqrt(squareArea) / 2)){
            result = "The circle is in the square";
            System.out.println("The circle is in the square");
        } else {
            result = "The circle is not in the square";
            System.out.println("The circle is not in the square");
        }

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        if ((Math.sqrt(circleArea / Math.PI)) >= (Math.sqrt(squareArea) / Math.sqrt(2))) {
            result = "The square is in the circle";
            System.out.println("The square is in the circle");
        } else {
            result = "The square is not in the circle";
            System.out.println("The square is not in the circle");
        }

        return result;
    }

}
