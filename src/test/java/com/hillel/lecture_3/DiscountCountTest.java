package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Сумма покупки составляет а рублей.
 * Если а больше 1000 рублей, то предоставляется скидка 15%.
 * Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.
 */

public class DiscountCountTest {

    private DiscountCountChecker discountCountChecker = new DiscountCountChecker();

    @Test
    public void checkDiscountExist() {
        double price = 345.8;
        int a = 1;

        if (price > 1000) {
            System.out.println("The total amount with discount is: " + price * 0.85);
        } else {
            System.out.println("Discount is not provided");
        }

//        assertEquals(discountCountChecker.checkDiscountCount(price), 0.0);
    }

    @Test
    public void checkDiscountNotExist() {
        double price = 1345.76;
        if (price > 1000) {
            System.out.println("The total amount with discount is: " + price * 0.85);
        } else {
            System.out.println("Discount is not provided");
        }

//        assertEquals(discountCountChecker.checkDiscountCount(price), 1143.896);
    }
}
