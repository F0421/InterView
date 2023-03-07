package com.company.func;

import java.text.DecimalFormat;

public class YuanUtil {
    public static String ToYuan(int fen) {
        DecimalFormat df = new DecimalFormat("#.00");
        String yuan = df.format(fen / 100);
        return "￥" + yuan;
    }
}
