package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {

        String message = "";

        if (number >= from && number <= to) {
            message = "Number " + number + " belong to interval [-5;3]";
            System.out.println("Number " + number + " belong to interval [-5;3]");
        } else {
            message ="Number " + number + " not belong to interval [-5;3]";
            System.out.println("Number " + number + " not belong to interval [-5;3]");
        }

        return message;
    }
}
