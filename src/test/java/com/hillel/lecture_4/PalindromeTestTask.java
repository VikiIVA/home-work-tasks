package com.hillel.lecture_4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая проверяет является ли строка палиндромом (использовать массив символов - char string[])
 */
public class PalindromeTestTask {

    private PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test(dataProvider = "palindromeProvider")
    public void palindromeTest(String word, boolean expectedResult) {
        char[] string = new char[5];
        if(string.length%2 == 0){
            for(int i = 0; i < string.length/2-1; i++){
                if(string[i] != string[string.length-i-1]){
                    System.out.println(word + " " + expectedResult);
                }
            }
        }else{
            for(int i = 0; i < (string.length-1)/2-1; i++){
                if(string[i] != string[string.length-i-1]){
                    System.out.println(word + " " + expectedResult);
                }
            }
        }
        System.out.println(word + " " + expectedResult);
    }
//        assertEquals(palindromeChecker.isPalindrome(word), expectedResult); ;



    @DataProvider(name = "palindromeProvider")
    public static Object[][] palindromeProvider() {
        return new Object[][] {
                { "1256521", true},
                { "burger", false},
                { "civic", true},
                { "trololo", false},
                { "rotator", true},
                { "stats", true},
        };
    }
}
