package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = false;
        for (int i = 0,j=value.length()-1; i <value.length()/2; i++,j--) {

            if(value.charAt(i)!=value.charAt(j))
            {
                return false;
            }

        }
        return true;
    }


    }


