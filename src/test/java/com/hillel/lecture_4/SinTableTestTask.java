package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {

    public static void main(String[] args) {
        double val;
        double a;
        for (val = 0; val <= 360; val+=10) {
            a = Math.sin(val * 3.14 / 180);
            Math.round(a);
            System.out.println ("Sin " + "(" + val + ")" +" " + a);
        }

    }

}
