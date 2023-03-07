package com.company;

public class Solutions {
    public static int applePrice = 8;
    public static int strawberryPrice = 13;
    public static int mangoPrice = 20;
    public static double discount = 0.8;


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

    public static double calculateDiscountPrice(int appleNum, int strawberryNum, int mangoNum) {
        double price = calculatePrice(appleNum, strawberryNum, mangoNum) * discount;
        return Math.round(price * 100) / 100.0;
    }

    public static double calculateLowerPrice(int appleNum, int strawberryNum, int mangoNum) {
        double totalPrice = calculateDiscountPrice(appleNum, strawberryNum, mangoNum);
        return totalPrice - Math.floor(totalPrice / 100) * 10;
    }


}
