package com.company.func;

import com.company.def.PriceDef;

public class CalcUtil {

    static double applePrice = PriceDef.getPrice("apple");
    static double strawberryPrice = PriceDef.getPrice("strawberry");
    static double mangoPrice = PriceDef.getPrice("mango");

    public static double calculatePrice(int appleNum, int strawberryNum) {
        if (strawberryNum < 0 || appleNum < 0) {
            throw new IllegalArgumentException("水果斤数为大于等于 0 的整数！");
        }
        return (applePrice * appleNum + strawberryPrice * strawberryNum);
    }

    public static double calculatePrice(int appleNum, int strawberryNum, int mangoNum) {

        if (strawberryNum < 0 || appleNum < 0 || mangoNum < 0) {
            throw new IllegalArgumentException("水果斤数为大于等于 0 的整数！");
        }
        return (applePrice * appleNum + strawberryPrice * strawberryNum + mangoPrice * mangoNum);
    }

    public static double calculateDiscountPrice(int appleNum, int strawberryNum, int mangoNum) {
        return calculatePrice(appleNum, strawberryNum, mangoNum) * 8000 / 10000;
    }

    public static double calculateLowerPrice(int appleNum, int strawberryNum, int mangoNum) {
        double totalPrice = calculateDiscountPrice(appleNum, strawberryNum, mangoNum);
        return totalPrice - Math.floor(totalPrice / 10000) * 1000;
    }
}
