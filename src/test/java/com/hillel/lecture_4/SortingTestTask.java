package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая сортировать массив от минимума в максимум и наоборот
 */
public class SortingTestTask {

    private SortingChecker sortingChecker = new SortingChecker();

    @Test
    public void checkFromMinToMaxTest() {
        int[] data = {20, 4, 3, 10, 2, -5, 0, -13, 1};
        int[] expectedResult = {-13, -5, 0, 1, 2, 3, 4, 10, 20};

        for(int i = data.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( data[j] < data[j+1] ){
                int tmp = data[j];
                data[j] = data[j+1];
                data[j+1] = tmp;
            }
        }
                System.out.println(data[i] + "  ");

        }


//        assertEquals(sortingChecker.fromMinToMax(data), expectedResult) ;
    }

    @Test
    public void checkFromMaxToMinTest() {
        int[] data = { 234, 758, -35, 345, 24535, -46, 214, -13, 145 };
        int[] expectedResult = {24535, 758, 345, 234, 214, 145, -13, -35, -46};

        for(int i = data.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( data[j] > data[j+1] ){
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
            System.out.print(data[i] + "  ");

        }

//        assertEquals(sortingChecker.fromMaxToMin(data), expectedResult) ;
    }
}
