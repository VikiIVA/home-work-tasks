package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    @Step
    public String isTriangleIsosceles(int a, int b, int c) {

//        TODO implements result
        String result = "";
        if (a == b) {
            if ( a!= c) {
                result = "Isosceles triangle!";
                System.out.println("Isosceles triangle!");
            } else {
                result = "No isosceles triangle!";
                System.out.println("No isosceles triangle!");
            }

        } else if (a == c) {
            if (a != b) {
                result = "Isosceles triangle!";
                System.out.println("Isosceles triangle!");
            }else {
                result = "No isosceles triangle!";
                System.out.println("No isosceles triangle!");
            }
        }else if (c == b) {
            if (c != a) {
                result = "Isosceles triangle!";
                System.out.println("Isosceles triangle!");
            }else {
                result = "No isosceles triangle!";
                System.out.println("No isosceles triangle!");
            }
        } else if (a != b && b != c) {
            if(a != c) {
                result = "No isosceles triangle!";
                System.out.println("No isosceles triangle!");
            }
        }

        return result;
    }
}
