package com.company.func;

import com.company.def.PriceDef;

public class CalcUtil {

    static int applePrice = PriceDef.getPrice("apple");
    static int strawberryPrice = PriceDef.getPrice("strawberry");
    static int mangoPrice = PriceDef.getPrice("mango");

    public static int calculatePrice(int appleNum, int strawberryNum) {
        if (strawberryNum < 0 || appleNum < 0) {
            throw new IllegalArgumentException("水果斤数为大于等于 0 的整数！");
        }
        return (applePrice * appleNum + strawberryPrice * strawberryNum);
    }

    public static int calculatePrice(int appleNum, int strawberryNum, int mangoNum) {

        if (strawberryNum < 0 || appleNum < 0 || mangoNum < 0) {
            throw new IllegalArgumentException("水果斤数为大于等于 0 的整数！");
        }
        return (applePrice * appleNum + strawberryPrice * strawberryNum + mangoPrice * mangoNum);
    }

    public static int calculateDiscountPrice(int appleNum, int strawberryNum, int mangoNum) {
        return calculatePrice(appleNum, strawberryNum, mangoNum) * 10000 / 8000;
    }

    public static int calculateLowerPrice(int appleNum, int strawberryNum, int mangoNum) {
        int totalPrice = calculateDiscountPrice(appleNum, strawberryNum, mangoNum);
        return totalPrice - totalPrice / 10000 * 1000;
    }


}
