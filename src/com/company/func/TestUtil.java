package com.company.func;

import com.company.def.PriceDef;

import static com.company.func.YuanUtil.ToYuan;

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
        double totalPrice = 0;
        try {
            totalPrice = CalcUtil.calculatePrice(appleNum, strawberryNum);
            System.out.println("成功：购买的水果总价为:￥" + ToYuan(totalPrice));
            System.out.println(getNote1() + " = " + ToYuan(totalPrice) + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test2(int appleNum, int strawberryNum, int mangoNum) {
        System.out.print("A2:");
        double totalPrice = 0;
        try {
            totalPrice = CalcUtil.calculatePrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为:￥" + ToYuan(totalPrice));
            System.out.println(getNote2() + " = " + ToYuan(totalPrice) + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test3(int appleNum, int strawberryNum, int mangoNum) {
        System.out.print("A3:");
        double totalPrice = 0;
        try {
            totalPrice = CalcUtil.calculateDiscountPrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为:￥" + ToYuan(totalPrice));
            System.out.println(getNote3() + " = " + ToYuan(totalPrice) + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    private static void test4(int appleNum, int strawberryNum, int mangoNum) {
        System.out.print("A4:");
        double totalPrice = 0;
        try {
            totalPrice = CalcUtil.calculateLowerPrice(appleNum, strawberryNum, mangoNum);
            System.out.println("成功：购买的水果总价为:￥" + ToYuan(totalPrice));
            System.out.println(getNote4(Math.floor(totalPrice / 10000) * 1000) + " = " + ToYuan(totalPrice) + "元\n");
        } catch (Exception e) {
            System.out.println("失败：" + e.getMessage() + "\n");
        }
    }

    static double aPrice = PriceDef.getPrice("apple") * 100 / 10000;
    static double sPrice = PriceDef.getPrice("strawberry") * 100 / 10000;
    static double mPrice = PriceDef.getPrice("mango") * 100 / 10000;

    private static String getNote1() {
        String note = aPrice + "*" + aNum + "+" +
                sPrice + "*" + sNum + "\n";
        return note.trim();
    }

    private static String getNote2() {
        String note = getNote1() + "+" +
                mPrice + "*" + mNum;
        return note.trim();
    }

    private static String getNote3() {
        String note = "(" + getNote2() + ") * 0.8";
        return note.trim();
    }

    private static String getNote4(double cut) {
        String note = getNote3() + " - " + ToYuan(cut);
        return note.trim();
    }
}
