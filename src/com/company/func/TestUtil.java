package com.company.func;

import com.company.def.PriceDef;

public class TestUtil {
    public static int aNum = 0;
    public static int sNum = 0;
    public static int mNum = 0;

    public static void testAll(int appleNum, int strawberryNum, int mangoNum) {
        aNum = appleNum;
        sNum = strawberryNum;
        mNum = mangoNum;
        test1(aNum, sNum);
        test2(aNum, sNum, mNum);
        test3(aNum, sNum, mNum);
        test4(aNum, sNum, mNum);
    }

    private static void test1(int appleNum, int strawberryNum) {
        System.out.print("A1:");
        int totalPrice = 0;
        try {
            totalPrice = CalcUtil.calculatePrice(appleNum, strawberryNum);
            System.out.println("成功：购买的水果总价为：" + YuanUtil.ToYuan(totalPrice));
            System.out.println(getNote1() + "=" + YuanUtil.ToYuan(totalPrice).replaceAll("￥", "") + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test2(int appleNum, int strawberryNum, int mangoNum) {
        System.out.print("A2:");
        int totalPrice = 0;

        try {
            totalPrice = CalcUtil.calculatePrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为：" + YuanUtil.ToYuan(totalPrice));
            System.out.println(getNote2() + "=" + YuanUtil.ToYuan(totalPrice).replaceAll("￥", "") + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test3(int appleNum, int strawberryNum, int mangoNum) {
        System.out.print("A3:");
        int totalPrice = 0;
        try {
            totalPrice = CalcUtil.calculateDiscountPrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为：" + YuanUtil.ToYuan(totalPrice));
            System.out.println(getNote3() + "=" + YuanUtil.ToYuan(totalPrice).replaceAll("￥", "") + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test4(int appleNum, int strawberryNum, int mangoNum) {
        System.out.print("A4:");
        int totalPrice = 0;
        try {
            totalPrice = CalcUtil.calculateLowerPrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为：" + YuanUtil.ToYuan(totalPrice));
            System.out.println(getNote4(totalPrice * 100 / 10000 / 100) + "=" + YuanUtil.ToYuan(totalPrice).replaceAll("￥", "") + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    static int aPrice = PriceDef.getPrice("apple") * 100 / 10000;
    static int sPrice = PriceDef.getPrice("strawberry") * 100 / 10000;
    static int mPrice = PriceDef.getPrice("mango") * 100 / 10000;

    private static String getNote1() {
        return aPrice + "*" + aNum + "+" +
                sPrice + "*" + sNum + "\n";
    }

    private static String getNote2() {
        return getNote1() + "+" +
                mPrice + "*" + mNum ;
    }

    private static String getNote3() {
        return "(" + getNote2() + ") * 0.8" ;
    }

    private static String getNote4(int cut) {
        return getNote3() + "- " + cut + "0";
    }
}
