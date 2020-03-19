package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая перевод десятичные числа в шестнадцатеричные и наоборот.
 */
public class DecimalToHexadecimalTestTask {

    private DecimalToHexadecimalChecker decimalToHexadecimalChecker = new DecimalToHexadecimalChecker();

    @Test
    public void fromDecimalToHexadecimalTest() {
        String expectedResult = "1E0F3";
        int decimal = 0;
        int add = 0;
        String number = expectedResult;
        for(int i=0;i<number.length();i++)
        {
            char c = number.charAt(number.length()-i-1);

            if(c=='A')       {
                add = 10;
            } else if(c=='B'){
                add = 11;
            } if(c=='C')     {
                add = 12;
            } if(c=='D')     {
                add = 13;
            } if(c=='E')     {
                add = 14;
            } if(c=='F')     {
                add = 15;
            } else           {
                add = Character.getNumericValue(c);
            }
            decimal = (int) (decimal + add*Math.pow(16,i));
        }
        System.out.println(decimal);



//        assertEquals(decimalToHexadecimalChecker.fromDecimalToHexadecimal(123123), expectedResult) ;
    }

    @Test
    public void fromHexadecimalToDecimalTest() {
        int expectedResult = 8855064;
        String hex="";
        int n = expectedResult;
        while (n!=0)
        {
            int r = n % 16;
            switch(r)
            {
                case 10: hex ='A'+ hex;
                    break;
                case 11: hex ='B'+ hex;
                    break;
                case 12: hex ='C'+ hex;
                    break;
                case 13: hex ='D'+ hex;
                    break;
                case 14: hex ='E'+ hex;
                    break;
                case 15: hex ='E'+ hex;
                    break;
                default: hex = r + hex;
            }
            n = n / 16;
        }
        System.out.println(hex);

//        assertEquals(decimalToHexadecimalChecker.fromHexadecimalToDecimal("871E18"), expectedResult) ;
    }
}
