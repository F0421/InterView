package com.company;

public class TestUtil {
    static void testAll(int appleNum, int strawberryNum, int mangoNum) {
        test1(appleNum, strawberryNum);
        test2(appleNum, strawberryNum, mangoNum);
        test3(appleNum, strawberryNum, mangoNum);
        test4(appleNum, strawberryNum, mangoNum);
    }

    private static void test1(int appleNum, int strawberryNum) {
        System.out.println("A1:");
        int totalPrice = 0;
        try {
            totalPrice = Solutions.calculatePrice(appleNum, strawberryNum);
            System.out.println("成功：购买的水果总价为：" + totalPrice + "\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test2(int appleNum, int strawberryNum, int mangoNum) {
        System.out.println("A2:");
        int totalPrice = 0;
        try {
            totalPrice = Solutions.calculatePrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为：" + totalPrice + "\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test3(int appleNum, int strawberryNum, int mangoNum) {
        System.out.println("A3:");
        double totalPrice = 0;
        try {
            totalPrice = Solutions.calculateDiscountPrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为：" + totalPrice + "\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test4(int appleNum, int strawberryNum, int mangoNum) {
        System.out.println("A4:");
        double totalPrice = 0;
        try {
            totalPrice = Solutions.calculateLowerPrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为：" + totalPrice + "\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }
}
