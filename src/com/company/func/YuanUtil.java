package com.company.func;

public class YuanUtil {
    public static String ToYuan(double money) {
        if (money == 0) {
            return "0.00";
        }
        return new java.text.DecimalFormat("#.00").format(money / 100);
    }
}
