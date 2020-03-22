package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";
        char[] word =value.toCharArray();
        for(int i=0;i<(word.length);i++)
        {
            if(word[i]!=' ')
            {
                result=result+word[i];
            }
            else
            {
                for(int c=result.length();c>0;c--)
                {
                    System.out.print(result.charAt(c-1));
                }
                System.out.print(" ");
                result="";
            }
        }
        for(int c=result.length();c>0;c--)
        {
            System.out.print(result.charAt(c-1));
        }

        return result;
    }

}
